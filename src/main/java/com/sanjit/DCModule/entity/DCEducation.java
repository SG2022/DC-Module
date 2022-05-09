package com.sanjit.DCModule.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "dceducation")
public class DCEducation {
	
	@Id
	@GeneratedValue
	@Column(name = "caseNumber")
	private Integer caseNumber;
	
	@Column(name = "graduationStatus")
	private String graduationStatus;
	
	@Column(name = "graduationYear")
	private Integer graduationYear;
	
	@Column(name = "university")
	private String university;
	
	@Column(name = "highestDegree")
	private String highestDegree;


}


