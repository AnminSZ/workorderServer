package cn.edu.ustc.sse.workorder.controller;

import cn.edu.ustc.sse.workorder.bean.Comment;
import cn.edu.ustc.sse.workorder.bean.RespBean;
import cn.edu.ustc.sse.workorder.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @RequestMapping("/{orderId}")
    public List<Comment> getCommentByOrderId(@PathVariable(value = "orderId",required = true) int orderId){
        return commentService.getCommentsByOrderId(orderId);
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public RespBean insertComment(Comment comment, MultipartFile attachmentTemp){
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
                try {
                    attachmentTemp.transferTo(file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String urlPath = "..\\..\\static\\uploads\\"+sonPath+"\\"+newFileName;
                comment.setAttachment(urlPath);
            }
        }
        if(commentService.insertComment(comment)==1)
            return new RespBean("success","添加成功");
        return new RespBean("error","添加失败");
    }
}
