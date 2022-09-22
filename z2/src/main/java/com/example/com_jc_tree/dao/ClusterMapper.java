package com.example.com_jc_tree.dao;
import com.example.hadoop.entity.Cluster;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ClusterMapper {
//    Cluster selectclusterid(int id);

    Cluster selectnbaid(int nba_id);
    public List<Cluster> getAll();
}
