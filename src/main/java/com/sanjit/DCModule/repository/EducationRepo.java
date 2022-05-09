package com.sanjit.DCModule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanjit.DCModule.entity.DCEducation;


public interface EducationRepo extends JpaRepository<DCEducation, Integer> {

}
