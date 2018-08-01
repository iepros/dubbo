package com.xfma.dubbo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xfma.service.IUserService;

/**
 * 发现暴露的接口
 * @author maxiangfeng
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-dubbo-consumer.xml")
public class SpringDubboConsumerTest {

	@Autowired
	private IUserService userService;
	@Test
	public void test() {
		System.out.println(userService.getUserById(1));
	}

}
