package cn.edu.ustc.sse.workorder.service;

import cn.edu.ustc.sse.workorder.bean.User;
import cn.edu.ustc.sse.workorder.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User login(User user){
        return userMapper.login(user);
    }

}
