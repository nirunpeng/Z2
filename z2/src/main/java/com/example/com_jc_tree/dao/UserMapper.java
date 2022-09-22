package com.example.com_jc_tree.dao;

import com.example.com_jc_tree.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {


    List<User> getUserById(int id);
}
