package org.example.service;

import org.example.bean.License;
import org.example.bean.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {

    public static final Map<String,User> userList = new HashMap<>();
    
    public String createUser(String userName){
        User user =  new User(userName);
        userList.put(user.getUserId(),user);
        return user.toString();
    }

    public Boolean addLicense(String userId, License license){
        return true;
    }
}
