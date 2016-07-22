package com.avhr.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.avhr.model.User;
import com.avhr.service.UserService;

public class UserServiceTest {

	private UserService userService;

	@Before
	public void setUp() throws Exception {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
				,"classpath:conf/spring-mybatis.xml"});
		userService = (UserService) context.getBean("userServiceImpl");
	}

	@Test
	public void testInsertUser() {
		User user =new User();
		user.setAge("21");
		user.setName(System.currentTimeMillis()+"");
		user.setPassword("111");
		System.out.println(userService.insertUser(user));
		System.out.println(user.getId());
	}

}
