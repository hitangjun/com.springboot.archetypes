package ${package}.service;

import ${package}.domain.User;
import ${package}.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserInfo(){
        User user=userMapper.findUserInfo();
        //User user=null;
        return user;
    }

}
