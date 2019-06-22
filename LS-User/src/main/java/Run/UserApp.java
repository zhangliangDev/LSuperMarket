package Run;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.user")
@MapperScan("com.user.mapper") // 
@SpringBootApplication
public class UserApp {
	public static void main(String[] args) {
		SpringApplication.run(UserApp.class, args);
		
		
	}
}
