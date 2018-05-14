package ie.cit.tutjpamvc.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class IndexController {

	@Controller
	public class HomeController {
		
		@RequestMapping(value="/index", method=GET)
		public String home() {
			System.out.println("index controller");
			return "index";
		}
	}
}