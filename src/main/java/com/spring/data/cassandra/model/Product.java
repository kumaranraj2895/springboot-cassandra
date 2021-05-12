package com.spring.data.cassandra.model;

import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Product {
  @PrimaryKey
  private UUID id;

  private String name;
  private String description;
  private boolean stock;

  public Product() {

  }

  public Product(UUID id, String name, String description, boolean stock) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.stock = stock;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getname() {
    return name;
  }

  public void setname(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isstock() {
    return stock;
  }

  public void setstock(boolean isstock) {
    this.stock = isstock;
  }

  @Override
  public String toString() {
    return "Tutorial [id=" + id + ", name=" + name + ", desc=" + description + ", stock=" + stock + "]";
  }
}
