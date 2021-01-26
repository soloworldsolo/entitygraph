package com.soloworld.graph.entitygraph.repository;

import com.soloworld.graph.entitygraph.entity.Land;
import java.util.List;

public interface BaseRepoistory <Land,Integer>{
   Land getLandWithFruits(Integer landId);
}
