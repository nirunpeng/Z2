package com.example.com_jc_tree.service;

import com.example.com_jc_tree.dao.ClusterMapper;
import com.example.com_jc_tree.entity.Cluster;
import com.example.com_jc_tree.support.AccessResult;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ClusterServiceImpl implements ClusterService{
    @Autowired
    public ClusterMapper clusterMapper;


    @Override
    public List<Cluster> getAll() {
        return clusterMapper.getAll();
    }

    @Override
    public List<Cluster> getSalary() {
        return null;
    }

    @Override
    public List<Cluster> selectthree() {
        return clusterMapper.selectthree();
    }
    @Override
    public List<Cluster> selectback() {
        return clusterMapper.selectback();
    }
    @Override
    public List<Cluster> selectscore() {
        return clusterMapper.selectscore();
    }
    @Override
    public List<Cluster> selectshot() {
        return clusterMapper.selectshot();
    }
    @Override
    public List<Cluster> selectsteal() {
        return clusterMapper.selectsteal();
    }
    @Override
    public List<Cluster> selectsession() {
        return clusterMapper.selectsession();
    }
    @Override
    public List<Cluster> selectblocks() {
        return clusterMapper.selectblocks();
    }
    @Override
    public List<Cluster> selectassist() {
        return clusterMapper.selectassist();
    }
    @Override
    public List<Cluster> selectgametime() {
        return clusterMapper.selectgametime();
    }
    @Override
    public List<Cluster> selectsalary() {
        return clusterMapper.selectsalary();
    }
}

