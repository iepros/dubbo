package com.xfma.dubbo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception{
//		System.out.println(StringUtils.trim("  hjkgjg   jgjgj   hghj   "));;
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("classpath:spring-dubbo-provider.xml");
		String [] names = context.getBeanDefinitionNames();
		for (String string : names) {
			System.out.println(string);
		}
		
		System.out.println("发布成功");
		System.in.read();

	}
}
