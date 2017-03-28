package service;

import bean.User;
import interf.UserService;

import java.util.Date;

/**
 * Created by Oliverlee on 2017/3/28.
 */
public class UserServiceConsumer {
    public UserServiceConsumer(UserService userService){
        this.userService = userService;
    }
    private UserService userService;
    public void SaveUser(){
        User user = new User();
        user.setName("liuchao");
        user.setSex(1);
        user.setRemark("我是刘超");
        user.setPassword("2222222");
        user.setMobile("1383838438");
        user.setBirthday(new Date());
        userService.update(user);
    }


}
