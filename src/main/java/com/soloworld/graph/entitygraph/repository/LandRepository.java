package com.soloworld.graph.entitygraph.repository;

import com.soloworld.graph.entitygraph.entity.Land;
import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LandRepository extends JpaRepository<Land,Integer>,BaseRepoistory<Land,Integer>{
@EntityGraph(value = "land-with-fruits")
List<Land> findAll();
}
