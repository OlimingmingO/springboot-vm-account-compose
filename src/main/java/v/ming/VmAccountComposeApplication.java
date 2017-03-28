package v.ming;

import bean.User;
import interf.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.Date;

@SpringBootApplication
public class VmAccountComposeApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(VmAccountComposeApplication.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"application1.xml"});
		context.start();
		UserService userService = (UserService) context.getBean("userService");
		User user = new User();
		user.setName("liuchao");
		user.setSex(1);
		user.setRemark("我是刘超");
		user.setPassword("2222222");
		user.setMobile("1383838438");
		user.setBirthday(new Date());
		userService.update(user);


//		UserServiceConsumer userServiceConsumer = new UserServiceConsumer(userService);
//		userServiceConsumer.SaveUser();

		System.in.read();
	}
}
