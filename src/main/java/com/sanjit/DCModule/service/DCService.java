package com.sanjit.DCModule.service;


import com.sanjit.DCModule.binding.DCChildDetails;
import com.sanjit.DCModule.binding.DCEducationForm;
import com.sanjit.DCModule.binding.DCIncomeForm;
import com.sanjit.DCModule.binding.DCPlansForm;

public interface DCService {
	
	public String addPlanInfo(DCPlansForm planform);
	public String addIncomeInfo(DCIncomeForm incomeform);
	public String addEducationInfo(DCEducationForm incomeform);
	public String addChildInfo(DCChildDetails childdetails);
	
	

}
