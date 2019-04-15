package cn.edu.ustc.sse.workorder.mapper;

import cn.edu.ustc.sse.workorder.bean.OrderInfo;
import cn.edu.ustc.sse.workorder.bean.OrderInfoCustom;

import java.util.List;

public interface OrderMapper {

    public OrderInfo selectByPrimaryKey(int id);

    public List<OrderInfo> selectAllOrders();

    public int deleteByPrimaryKey(int id);

    public int insert(OrderInfo order);

    public int update(OrderInfo order);

    public List<OrderInfo> selectByKeywords(OrderInfoCustom orderInfoCustom);

    public List<OrderInfo> selectByUserID(int id);

    public int updateStatus(OrderInfo orderInfo);


}
