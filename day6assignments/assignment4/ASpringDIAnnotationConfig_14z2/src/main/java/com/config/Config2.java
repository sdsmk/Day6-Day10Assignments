package com.config;
import com.eg.A;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

public class Config2 {
	@Lazy
	@Bean 
	@Scope("prototype")
	public A getA(int p1,float f1){
		return new A(p1,f1);
	}
}
