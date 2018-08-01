package com.xfma.dubbo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 启动spring配置文件，暴露接口到zookeeper
 * @author maxiangfeng
 *
 */
public class Test {

	public static void main(String[] args) throws Exception{
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
