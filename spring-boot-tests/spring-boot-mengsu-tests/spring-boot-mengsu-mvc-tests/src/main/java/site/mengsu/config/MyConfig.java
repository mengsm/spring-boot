package site.mengsu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import site.mengsu.service.UserService;

/**
 * @Author: fengjian
 * @Date: 2021/7/31
 * @Description:
 */
@Configuration
public class MyConfig {

	@Bean
	public UserService getUserService() {
		return new UserService();
	}
}
