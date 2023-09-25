package com.aop.aspects_oriented_porg.advices;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@After
	("execution(* com.aop.aspects_oriented_porg.services.Login_Implement.login())")
	public void executeBeforeLogin() {
		
		System.out.println("User is being authenticated");
	}
	
	
	

}
