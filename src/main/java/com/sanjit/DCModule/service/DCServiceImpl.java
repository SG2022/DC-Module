package com.sanjit.DCModule.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanjit.DCModule.binding.Child;
import com.sanjit.DCModule.binding.DCChildDetails;
import com.sanjit.DCModule.binding.DCEducationForm;
import com.sanjit.DCModule.binding.DCIncomeForm;
import com.sanjit.DCModule.binding.DCPlansForm;
import com.sanjit.DCModule.entity.DCChildEntity;
import com.sanjit.DCModule.entity.DCEducation;
import com.sanjit.DCModule.entity.DCIncome;
import com.sanjit.DCModule.entity.DCPlans;
import com.sanjit.DCModule.repository.ChildRepo;
import com.sanjit.DCModule.repository.EducationRepo;
import com.sanjit.DCModule.repository.IncomeRepo;
import com.sanjit.DCModule.repository.PlansRepo;



@Service
public class DCServiceImpl implements DCService {
	@Autowired PlansRepo plansrepo;
	@Autowired IncomeRepo incomerepo;
	@Autowired EducationRepo educationrepo;
	@Autowired ChildRepo childrepo;
	
   
	@Override
	public String addPlanInfo(DCPlansForm planform) {
		
	DCPlans plans = new DCPlans();
	BeanUtils.copyProperties(planform, plans);
	plansrepo.save(plans);
	return("plan details succesfully");
	
	}

	@Override
	public String addIncomeInfo(DCIncomeForm incomeform) {
		DCIncome income = new DCIncome();
		BeanUtils.copyProperties(incomeform, income);
		incomerepo.save(income);
		return("income details saved");
	}

	@Override
	public String addEducationInfo(DCEducationForm educationform) {
		
		DCEducation education = new DCEducation();
		BeanUtils.copyProperties(educationform, education);
		educationrepo.save(education);
		
		return "education details saved succesfully";
	}

	@Override
	public String addChildInfo(DCChildDetails childdetails) {
		List<Child> children = childdetails.getChildren();
		Integer casenumber = childdetails.getCaseNumber();
		for(Child child:children)
		{
			DCChildEntity entity = new DCChildEntity();
			BeanUtils.copyProperties(child, entity);
			entity.setCaseNumber(casenumber);
			childrepo.save(entity);
			
			
		}
		
		return "Children info saved ";
	}
	
	

	
	
	
	
	

}
