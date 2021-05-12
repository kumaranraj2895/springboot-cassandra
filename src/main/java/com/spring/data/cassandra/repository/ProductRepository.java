package com.spring.data.cassandra.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import com.spring.data.cassandra.model.Product;

public interface ProductRepository extends CassandraRepository<Product, UUID> {
  @AllowFiltering
  List<Product> findByStock(boolean stock);
  
  List<Product> findByNameContaining(String name);
}
