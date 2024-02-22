package com.swprojects.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swprojects.webservices.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}