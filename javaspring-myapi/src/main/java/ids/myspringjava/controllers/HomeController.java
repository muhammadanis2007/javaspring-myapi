package ids.myspringjava.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	@GetMapping(path="/")
	public String HomeWelcome(ModelMap model) {
		
		System.out.println("Welcome HOME");
		
		model.addAttribute("message", "DevOps By Developer Gate way");
		return "/home";
	} 
	
}
