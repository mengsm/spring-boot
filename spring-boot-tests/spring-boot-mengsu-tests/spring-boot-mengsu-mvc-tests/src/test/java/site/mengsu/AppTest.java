package site.mengsu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import site.mengsu.config.MyConfig;
import site.mengsu.service.UserService;

/**
 * @Author: fengjian
 * @Date: 2021/7/31
 * @Description:
 */
public class AppTest {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		UserService bean = context.getBean(UserService.class);
		System.out.println(bean.say());

	}
}
