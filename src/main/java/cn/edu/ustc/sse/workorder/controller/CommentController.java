package cn.edu.ustc.sse.workorder.controller;

import cn.edu.ustc.sse.workorder.bean.Comment;
import cn.edu.ustc.sse.workorder.bean.RespBean;
import cn.edu.ustc.sse.workorder.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public RespBean insertComment(Comment comment){
        if(commentService.insertComment(comment)==1)
            return new RespBean("success","添加成功");
        return new RespBean("error","添加失败");
    }
}
