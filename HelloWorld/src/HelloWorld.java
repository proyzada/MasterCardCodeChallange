  
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
/**
 * @author HelloWorld.com - Simple Spring Boot Example
 *
 */
 
// @RestController is a convenience annotation that is itself annotated with @Controller and @ResponseBody
@RestController
 
// @EnableAutoConfiguration enables auto-configuration of the Spring Application Context, attempting to guess
// and configure beans that you are likely to need.
@EnableAutoConfiguration
public class HelloWorld {
 
	// @RequestMapping annotation is used for mapping web requests onto specific handler classes
	@RequestMapping("/")
	String basicURL() {
		return "Welcome to Spring Boot Hello World Tutorial";
	}
 
	@RequestMapping("helloworld")
	String helloworldURL() {
		return "Hello World ! This is your first SpringBoot Example";
	}
 
	public static void main(String[] args) throws Exception {
 
		// SpringApplication classes that can be used to bootstrap and launch a Spring application from a Java
		// main method. By default class will perform the following steps to bootstrap your application.
		SpringApplication.run(HelloWorld.class, args);
	}
 
}