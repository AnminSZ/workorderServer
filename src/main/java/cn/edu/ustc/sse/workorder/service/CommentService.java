package cn.edu.ustc.sse.workorder.service;

import cn.edu.ustc.sse.workorder.bean.Comment;
import cn.edu.ustc.sse.workorder.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentMapper commentMapper;

    public List<Comment> getCommentsByOrderId(int orderId){
            return commentMapper.selectCommentsByOrderId(orderId);
    }

    public int insertComment(Comment comment){
        return commentMapper.insertComment(comment);
    }
}
