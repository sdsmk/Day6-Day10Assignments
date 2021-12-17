package com.config;
import com.eg.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class Config1 {
	@Bean 
	@Scope("prototype")
	public Employee getEBean(){
		System.out.println("public Employee getEBean()");
		return new Employee();
	}	
}
