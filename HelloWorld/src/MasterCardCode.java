 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
/**
 * @author MasterCardCode.com - Simple Spring Boot Example
 *
 */ 
 
 
// @EnableAutoConfiguration enables auto-configuration of the Spring Application Context, attempting to guess
// and configure beans that you are likely to need.
@RestController
@EnableAutoConfiguration
public class MasterCardCode {
 	
	// @RequestMapping annotation is used for mapping web requests onto specific handler classes
	@RequestMapping("/connected")
	String basicURL(@RequestParam("origin") String city1,
                                            @RequestParam("destination") String city2,
                                            Model map) {
		String response ="no";
		BufferedReader reader = null;
		try {
			String line;
			reader = new BufferedReader(new FileReader(
					"c:\\city.txt"));
			while ((line= reader.readLine()) != null) {
				if(line.contains(city1) && line.contains(city2)){
						response ="yes";
						break;
				}		
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {

			   try {
			    if (reader != null)
			     reader.close();
			   } catch (IOException ex) {
			    ex.printStackTrace();
			   }
			  }

		return response;
	}
 
	
	public static void main(String[] args) throws Exception {
 
		// SpringApplication classes that can be used to bootstrap and launch a Spring application from a Java
		// main method. By default class will perform the following steps to bootstrap your application.
		SpringApplication.run(MasterCardCode.class, args);
	}
 
}