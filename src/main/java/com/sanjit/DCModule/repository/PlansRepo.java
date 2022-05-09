package com.sanjit.DCModule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanjit.DCModule.entity.DCPlans;

@Repository
public interface PlansRepo extends JpaRepository<DCPlans, Integer> {

}
