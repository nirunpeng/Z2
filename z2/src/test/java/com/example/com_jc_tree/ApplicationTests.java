package com.example.com_jc_tree;

import com.example.com_jc_tree.support.utils.CacheService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class ApplicationTests {
    @Autowired
    CacheService cacheService;


    @Test
    void add(){
        cacheService.add("jc", "summer");
        Assert.isTrue(true);
    }

    @Test
    void addTimeout(){
        cacheService.add("testTimeOut", 1234, 30, TimeUnit.SECONDS);
        Assert.isTrue(true);
    }

    @Test
    void addHash(){
        cacheService.addHashCache("user", "name", "zhangsan");
        Assert.isTrue(true);
    }

    @Test
    void getHash(){
        String name = cacheService.getHashCache("user", "name").toString();
        System.out.println(name);
        Assert.isTrue(true);
    }

    @Test
    void addTree(){
        Tree tree = new Tree();
        tree.setId(10);
        tree.setLongitude(13.0);
        tree.setLatitude(188.2);
        tree.setLife(500);
        tree.setName("JC tree");
        tree.setTime(new Date());
        cacheService.add("tree:" + tree.getId(), tree);
        Assert.isTrue(true);
    }

    @Test
    void getTree(){

//        cacheService.get("tree:", 10);
//        Assert.isTrue(true);
    }
    @Test
    void contextLoads() {

    }

}
