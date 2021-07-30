package site.mengsu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fengjian
 * @Date: 2021/7/30
 * @Description:
 */
@RestController
@SpringBootApplication
public class MyTestMVCApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyTestMVCApplication.class, args);
	}

	@GetMapping
	public String index () {
		return "success";
	}

}
