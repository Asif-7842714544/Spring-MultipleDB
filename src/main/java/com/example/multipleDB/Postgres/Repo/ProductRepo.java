package com.example.multipleDB.Postgres.Repo;

import com.example.multipleDB.Postgres.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {



}
