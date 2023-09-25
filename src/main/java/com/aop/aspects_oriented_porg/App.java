package com.aop.aspects_oriented_porg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.aspects_oriented_porg.services.Login;
import com.aop.aspects_oriented_porg.services.Login_Implement;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config.xml");
    
    Login loginImpl= (Login) applicationContext.getBean("login");
    
    loginImpl.login();
    
    
    }
}
