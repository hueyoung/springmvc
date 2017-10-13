package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springmvc.service.UserService;

@Controller
@RequestMapping("rest")
public class AutoWiredController {

	@Autowired
	UserService user;
	
	@RequestMapping(value="user")
	public String user(Model model) {
		model.addAttribute("name", user.getName());
		model.addAttribute("age", user.getAge());
		return "rest/userDetail";
	}
}
