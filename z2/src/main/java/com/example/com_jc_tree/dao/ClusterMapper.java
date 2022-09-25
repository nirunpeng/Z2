package com.example.com_jc_tree.dao;
import com.example.com_jc_tree.entity.Cluster;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ClusterMapper {
//    Cluster selectclusterid(int id);

    Cluster selectnbaid(int nba_id);
    public List<Cluster> getAll();

    List<Cluster> getSalary();

    List<Cluster> selectthree();

    List<Cluster> selectback();

    List<Cluster> selectscore();

    List<Cluster> selectshot();

    List<Cluster> selectsteal();

    List<Cluster> selectsession();

    List<Cluster> selectblocks();

    List<Cluster> selectassist();

    List<Cluster> selectgametime();

    List<Cluster> selectsalary();
}
