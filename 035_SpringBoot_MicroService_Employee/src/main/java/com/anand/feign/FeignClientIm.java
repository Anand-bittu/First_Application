package com.anand.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.anand.response.AddressResponse;

@FeignClient(name = "add",url = "http://localhost:8080")
public interface FeignClientIm {

	 @GetMapping("/address/{emp_id}")
	 AddressResponse getAddressById(@PathVariable("emp_id")Integer emp_id);
	
	
	
}
