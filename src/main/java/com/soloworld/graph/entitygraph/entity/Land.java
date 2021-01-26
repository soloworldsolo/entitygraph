package com.soloworld.graph.entitygraph.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.OneToMany;
@NamedEntityGraph(name = "land-with-fruits",attributeNodes = {@NamedAttributeNode("fruitSet")})
@Entity
public class Land {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private int landId;

  private int size;

  private double cost;

  private String type;
  @OneToMany(mappedBy = "land",fetch = FetchType.LAZY)
  private Set<Fruit> fruitSet = new HashSet<>();


  public int getLandId() {
    return landId;
  }

  public void setLandId(int landId) {
    this.landId = landId;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Set<Fruit> getFruitSet() {
    return fruitSet;
  }

  public void setFruitSet(Set<Fruit> fruitSet) {
    this.fruitSet = fruitSet;
  }
}
