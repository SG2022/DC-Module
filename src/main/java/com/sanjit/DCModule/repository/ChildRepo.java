package com.sanjit.DCModule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanjit.DCModule.entity.DCChildEntity;

public interface ChildRepo extends JpaRepository<DCChildEntity, Integer> {

}
