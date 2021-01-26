package com.soloworld.graph.entitygraph.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fruits")
public class Fruit {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private int quantity;
  @ManyToOne
  @JoinColumn(name = "landId")
  private Land land;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public Land getLand() {
    return land;
  }

  public void setLand(Land land) {
    this.land = land;
  }
}
