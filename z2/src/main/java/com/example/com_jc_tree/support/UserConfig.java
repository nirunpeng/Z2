package com.example.com_jc_tree.support;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public User Test(){
        User user = new User();
        user.setName("zhangsan");
        return user;
    }
}
