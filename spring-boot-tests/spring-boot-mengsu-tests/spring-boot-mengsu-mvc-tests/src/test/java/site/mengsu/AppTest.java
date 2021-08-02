package site.mengsu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: fengjian
 * @Date: 2021/7/31
 * @Description:
 */
public class AppTest {
	public static void main(String[] args) {

//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//		UserService bean = context.getBean(UserService.class);
//		System.out.println(bean.say());

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("site.mengsu");
		for (String beanDefinitionName : context.getBeanDefinitionNames()) {
			System.out.println(beanDefinitionName);
		}

	}
}
