package ie.cit.tutjpamvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ie.cit.tutjpamvc.entity.Upload;

@Controller
public class DouploadController {

	@GetMapping("/doupload")
	public String uploadForm(Model model) {
		System.out.println("doupload get controller");
		model.addAttribute("doupload", new Upload());
		return "doupload";
	}

	@PostMapping("/doupload")
	public String uploadSubmit(@ModelAttribute Upload upload) {
		System.out.println("doupload post controller");
		return "success";
	}

}