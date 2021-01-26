package com.soloworld.graph.entitygraph.repository;

import com.soloworld.graph.entitygraph.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitRepository extends JpaRepository<Fruit,Integer> {

}
