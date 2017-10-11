package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnnotationController {
	
	@RequestMapping({"/hello2","/"})
	public String test(String name, Model model) {
		System.out.println("run AnnotationController" + ",name = " + name);
//		model.put("success", name);
		
		model.addAttribute("name", name);
		return "annotationController";
	}
}
