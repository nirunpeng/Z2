package com.example.com_jc_tree.controller;

import com.example.hadoop.entity.Cluster;
import com.example.hadoop.service.ClusterService;
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

    @RequestMapping("/selectnbaid")
    @ResponseBody
    public String selectnabid(int nba_id){
        Cluster cluster = clusterService.selectnbaid(nba_id);
        return cluster.toString();
    }

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Cluster> getAll(){
        return clusterService.getAll();
    }
}
