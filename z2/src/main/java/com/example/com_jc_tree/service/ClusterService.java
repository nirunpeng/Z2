package com.example.com_jc_tree.service;

import com.example.com_jc_tree.entity.Cluster;

import java.util.List;

public interface ClusterService {

    Cluster selectnbaid(int nba_id);
    public List<Cluster> getAll();
}
