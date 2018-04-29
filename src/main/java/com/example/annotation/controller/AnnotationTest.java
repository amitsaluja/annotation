package com.example.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.annotation.LowerCase;
import com.example.annotation.LowerCase.type;
import com.example.annotation.UpperCase;
//import com.example.annotation.custom.annotation.Decrypt.type;


@RestController
@RequestMapping("/test")
public class AnnotationTest {
	
	
	
	
	@PostMapping("/upper-case")
	public void upperCaseTest(@UpperCase("param1") String paramOne) {
		
		System.out.println(paramOne);
		
	}

	
	@PostMapping("/lower-case")
	@LowerCase(parameterName="param1" , type=type.PARAM)
	public void lowerCaseTest(String param1) {
		
		System.out.println(param1);
		
	}
	
	

}
