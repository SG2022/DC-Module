package com.sanjit.DCModule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanjit.DCModule.entity.DCIncome;

@Repository
public interface IncomeRepo extends JpaRepository<DCIncome, Integer> {

}
