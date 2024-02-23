package com.swprojects.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swprojects.webservices.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}