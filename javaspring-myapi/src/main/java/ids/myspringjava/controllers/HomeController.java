package ids.myspringjava.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String HomeWelcome(ModelMap model) {
		
		System.out.println("Welcome HOME");
		
		model.addAttribute("message", "DevOps By Developer Gate way");
		
		return "/home";
	} 
	
	@RequestMapping("/")
	public String index() {
		return "Spring Boot Example!!";
	}
	
	
}
