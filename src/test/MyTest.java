package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.User;
import com.spring.service.UserService;

public class MyTest {
	@Test
	public void test(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService usi = (UserService)ac.getBean("service");
		User user=(User) ac.getBean("user");
		usi.add(user);
	}
}
