package com.soloworld.graph.entitygraph.repository;

import com.soloworld.graph.entitygraph.entity.Land;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class LandRepositoryImpl implements BaseRepoistory<Land,Integer>{
 @PersistenceContext
  private EntityManager entityManager;

  @Override
  public Land getLandWithFruits(Integer landId) {
    EntityGraph graph = entityManager.getEntityGraph("land-with-fruits");
    Map<String, Object> properties = new HashMap<>();
    properties.put("javax.persistence.fetchgraph", graph);

    return entityManager.find(Land.class,landId,properties);
  }


}
