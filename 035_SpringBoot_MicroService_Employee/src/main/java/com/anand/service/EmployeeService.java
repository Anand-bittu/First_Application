package com.anand.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.anand.entity.Employee;
import com.anand.feign.FeignClientIm;
import com.anand.repo.EmployeeRepo;
import com.anand.response.AddressResponse;
import com.anand.response.EmployeeResponse;

@Service
public class EmployeeService {
    @Autowired
	private EmployeeRepo repo;
	
    @Autowired
    private ModelMapper modelMapper;
   
    @Autowired
    private FeignClientIm feignClinet;
   	
	public EmployeeResponse getEmployeeBYId(Integer emp_id) {
		System.out.println("inside Get EMployee");	
		Employee employee=repo.findById(emp_id).get();
		EmployeeResponse employeeResponse=modelMapper.map(employee,EmployeeResponse.class);
	   //now set address
	    AddressResponse addressResponse=feignClinet.getAddressById(emp_id);
	     //now set the response
	    employeeResponse.setResponse(addressResponse);   
	    return employeeResponse;
	}
	
	
	
}
