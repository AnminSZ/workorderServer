package cn.edu.ustc.sse.workorder.service;

import cn.edu.ustc.sse.workorder.bean.OrderInfo;
import cn.edu.ustc.sse.workorder.bean.OrderInfoCustom;
import cn.edu.ustc.sse.workorder.common.OrderNumberFactory;
import cn.edu.ustc.sse.workorder.mapper.OrderMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderMapper orderMapper;

    public PageInfo<OrderInfo> getAllOrders(int page, int pageSize){
        PageHelper.startPage(page, pageSize);
        List<OrderInfo> list = orderMapper.selectAllOrders();
        PageInfo<OrderInfo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    public OrderInfo getOrderByID(int id){
        return orderMapper.selectByPrimaryKey(id);
    }

    public int insertOrder(OrderInfo orderInfo){
        String number = OrderNumberFactory.getRandomOrderNumber();
        orderInfo.setNumber(number);
        return orderMapper.insert(orderInfo);
    }

    public int updateOrder(OrderInfo orderInfo) {

        return orderMapper.update(orderInfo);
    }

    public int deleteOrder(int id){
        return orderMapper.deleteByPrimaryKey(id);
    }

    public PageInfo<OrderInfo> getOrderByKeywords(OrderInfoCustom orderInfoCustom,int page,int pageSize){
        PageHelper.startPage(page, pageSize);
        List<OrderInfo> list = orderMapper.selectByKeywords(orderInfoCustom);
        PageInfo<OrderInfo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    public PageInfo<OrderInfo> getOrderByUserId(int uid,int page,int pageSize){
        PageHelper.startPage(page, pageSize);
        List<OrderInfo> list = orderMapper.selectByUserID(uid);
        PageInfo<OrderInfo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    public int updateOrderStatus(OrderInfo orderInfo){
        return orderMapper.updateStatus(orderInfo);
    }


}
