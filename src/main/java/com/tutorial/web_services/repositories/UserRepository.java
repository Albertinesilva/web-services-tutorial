package com.tutorial.web_services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.web_services.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}