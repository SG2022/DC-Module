package com.sanjit.DCModule.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data

@Table(name = "dcplans")
public class DCPlans {
	@Id
	@GeneratedValue
	@Column(name = "caseNumber")
	private Integer caseNumber;
	
	@Column(name = "planName")
	private String planName;

}
