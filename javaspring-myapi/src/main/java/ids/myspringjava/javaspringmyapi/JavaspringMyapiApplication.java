package ids.myspringjava.javaspringmyapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages= {"ids.myspringjava.*"})
public class JavaspringMyapiApplication extends SpringBootServletInitializer {

	
	public static void main(String[] args) {
			SpringApplication.run(JavaspringMyapiApplication.class, args);
		
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		      
		return builder.sources(JavaspringMyapiApplication.class);
	}
	

}
 