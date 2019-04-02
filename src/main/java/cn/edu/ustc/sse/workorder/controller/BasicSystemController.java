package cn.edu.ustc.sse.workorder.controller;

import cn.edu.ustc.sse.workorder.bean.User;
import cn.edu.ustc.sse.workorder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "login",method = RequestMethod.POST)
public class BasicSystemController {

    @Autowired
    private UserService userService;

    @RequestMapping("")
    public User login(User user){
        return userService.login(user);
    }
}
