package cn.edu.ustc.sse.workorder.controller;

import cn.edu.ustc.sse.workorder.bean.OrderInfo;
import cn.edu.ustc.sse.workorder.bean.OrderInfoCustom;
import cn.edu.ustc.sse.workorder.bean.RespBean;
import cn.edu.ustc.sse.workorder.service.OrderService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/order")
public class BasicOrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public PageInfo<OrderInfo> getAllOrders(@RequestParam(value = "page", defaultValue = "1") int page,
                                            @RequestParam(value = "pageSize", defaultValue = "8") int pageSize)  {
        return orderService.getAllOrders(page, pageSize);
    }

    @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
    public OrderInfo getOrderByID(@PathVariable(value = "id", required = true) int id) {
        return orderService.getOrderByID(id);
    }

    @RequestMapping(value = "/user/{uid}", method = RequestMethod.GET)
    public PageInfo<OrderInfo> getOrderByUserID(@PathVariable(value = "uid", required = true) int uid,
                                                @RequestParam(value = "page", defaultValue = "1") int page,
                                                @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        return orderService.getOrderByUserId(uid, page, pageSize);
    }


    @RequestMapping(value = "/detail/{id}", method = RequestMethod.DELETE)
    public RespBean deleteOrderByID(@PathVariable(value = "id",required = true) int id) {
        if (orderService.deleteOrder(id) == 1)
            return new RespBean("success", "删除成功");
        return new RespBean("error", "删除失败!");
    }

    @RequestMapping(value = "/detail", method = RequestMethod.PUT)
    public RespBean updateOrder(OrderInfo orderInfo) {
        if (orderService.updateOrder(orderInfo) == 1)
            return new RespBean("success", "更新成功");
        return new RespBean("error", "更新失败!");
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public RespBean insertOrder(OrderInfo orderInfo, MultipartFile attachmentTemp) throws IOException {
        //原始名称
        if(attachmentTemp!=null) {
            String originalFileName = attachmentTemp.getOriginalFilename();
            if (originalFileName != "" && originalFileName != null) {
                //存储图片的物理地址
                String filePath = "F:\\IDEAProjects\\workorderUI\\static\\uploads\\";
                //子文件夹
                String sonPath = new SimpleDateFormat("yyyyMMdd").format(new Date());
                //存储的完整目录
                String fullPath = filePath + sonPath + "\\";
                //新的文件名称
                String newFileName = UUID.randomUUID() + originalFileName.substring(originalFileName.indexOf('.'));
                File file = new File(fullPath + newFileName);
                if(!file.getParentFile().exists()){  //如果文件夹不存在 创建文件夹
                    file.getParentFile().mkdir();
                }
                //文件写入磁盘
                attachmentTemp.transferTo(file);
                String urlPath = "..\\..\\static\\uploads\\"+sonPath+"\\"+newFileName;
                orderInfo.setAttachment(urlPath);
            }
        }
        if (orderService.insertOrder(orderInfo) == 1)
            return new RespBean("success", "添加成功");
        return new RespBean("error", "添加失败!");
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public PageInfo<OrderInfo> queryOrder(OrderInfoCustom orderInfoCustom,
                                          @RequestParam(value = "page", defaultValue = "1") int page,
                                          @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        return orderService.getOrderByKeywords(orderInfoCustom, page, pageSize);
    }

    @RequestMapping(value = "/status", method = RequestMethod.PUT)
    public RespBean updateOrderStatus(OrderInfo orderInfo) {
        if (orderService.updateOrderStatus(orderInfo) == 1)
            return new RespBean("success", "更新成功");
        return new RespBean("error", "更新失败");
    }


}