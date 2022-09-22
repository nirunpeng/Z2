package com.example.com_jc_tree.service;

import com.example.com_jc_tree.dao.ClusterMapper;
import com.example.com_jc_tree.entity.Cluster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClusterServiceImpl implements ClusterService{
    @Autowired
    public ClusterMapper clusterMapper;
    @Override
    public Cluster selectnbaid(int nba_id) { return clusterMapper.selectnbaid(nba_id);}


    @Override
    public List<Cluster> getAll() {
        return clusterMapper.getAll();
    }
}
