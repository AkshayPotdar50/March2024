package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*make controller class after config and then give annotation*/
@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		System.out.println("Akshay Jewellers");
		return "index";
		}
	

}
