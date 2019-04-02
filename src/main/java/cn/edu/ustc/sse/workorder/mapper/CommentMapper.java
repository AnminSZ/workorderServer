package cn.edu.ustc.sse.workorder.mapper;

import cn.edu.ustc.sse.workorder.bean.Comment;
import cn.edu.ustc.sse.workorder.bean.OrderInfo;

import java.util.List;

public interface CommentMapper {
    List<Comment> selectCommentsByOrderId(int orderId);

    int insertComment(Comment comment);
}
