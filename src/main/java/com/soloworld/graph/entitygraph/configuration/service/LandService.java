package com.soloworld.graph.entitygraph.configuration.service;

import com.soloworld.graph.entitygraph.entity.Land;
import com.soloworld.graph.entitygraph.repository.LandRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LandService {

  @Autowired
  private LandRepository landRepository;


  public Land getLands() {
    return landRepository.getLandWithFruits(1);
  }

  public List<Land> getAllLands() {
    return landRepository.findAll();
  }

}
