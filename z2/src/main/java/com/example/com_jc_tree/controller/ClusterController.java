package com.example.com_jc_tree.controller;


import com.example.com_jc_tree.entity.Cluster;
import com.example.com_jc_tree.service.ClusterService;
import com.example.com_jc_tree.support.AccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ClusterController {
    @Autowired
    public ClusterService clusterService;
    //三分命中率查询
    @RequestMapping("/selectthree")
    @ResponseBody
    public List<Cluster> selectthree(){
        return clusterService.selectthree();
    }
    //篮板查询
    @RequestMapping("/selectback")
    @ResponseBody
    public List<Cluster> selectback(){
        return clusterService.selectback();
    }
    //得分
    @RequestMapping("/selectscore")
    @ResponseBody
    public List<Cluster> selectscore(){
        return clusterService.selectscore();
    }
    //投篮命中率
    @RequestMapping("/selectshot")
    @ResponseBody
    public List<Cluster> selectshot(){
        return clusterService.selectshot();
    }
    //抢断
    @RequestMapping("/selectsteal")
    @ResponseBody
    public List<Cluster> selecteal(){
        return clusterService.selectsteal();
    }
    //场次
    @RequestMapping("/selectsession")
    @ResponseBody
    public List<Cluster> selectsession(){
        return clusterService.selectsession();
    }
    //盖帽
    @RequestMapping("/selectblocks")
    @ResponseBody
    public List<Cluster> selectblocks(){
        return clusterService.selectblocks();
    }
    //助攻
    @RequestMapping("/selectassist")
    @ResponseBody
    public List<Cluster> selectassist(){
        return clusterService.selectassist();
    }
    //场均时间
    @RequestMapping("/selectgametime")
    @ResponseBody
    public List<Cluster> selectgametime(){
        return clusterService.selectgametime();
    }
    //薪资
    @RequestMapping("/selectsalary")
    @ResponseBody
    public List<Cluster> selectsalary(){
        return clusterService.selectsalary();
    }
    //总查询
    @RequestMapping("/getAll")
    @ResponseBody
    public List<Cluster> getAll(){
        return clusterService.getAll();
    }

}
