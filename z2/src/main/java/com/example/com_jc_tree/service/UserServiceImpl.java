package com.example.com_jc_tree.service;

import com.example.com_jc_tree.dao.UserMapper;
import com.example.com_jc_tree.entity.User;
import com.example.com_jc_tree.support.AccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;


    @Override
    public AccessResult getUserById(int id){
        List<User> users = userMapper.getUserById(id);

        if(users.size() == 1){
            Map<String ,User> map = new HashMap<>();
            map.put("tree", users.get(0));
            return new AccessResult(0,"根据userId查询成功！",map);
        }else{
            return new AccessResult(-1,"根据userId查询失败", null);
        }
    }
}

