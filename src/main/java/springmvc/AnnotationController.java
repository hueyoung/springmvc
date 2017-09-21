package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnnotationController {
	
	@RequestMapping({"/hello2","/"})
	public String test() {
		System.out.println("run AnnotationController");
		return "annotationController";
	}
}
