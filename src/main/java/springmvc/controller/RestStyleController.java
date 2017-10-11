package springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.bean.User;


@Controller
@RequestMapping("rest")
public class RestStyleController  {

	
	@Autowired
	protected HttpServletRequest request;

	@Autowired
	protected HttpServletResponse response;


	
	@RequestMapping(value="/object", method=RequestMethod.GET)
	public String user() {
		return "rest/ObjectTest";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String add(Model model) {
		model.addAttribute(new User());
		return "rest/restStyleController";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(@Validated User user, BindingResult rs, Model model) {
		if (rs.hasErrors()) {
			return "rest/restStyleController";
		}
		model.addAttribute("user", user);
		return "rest/userList";
	}
	
	@RequestMapping(value="/userList")
	public String list(User user, Model model) {
		model.addAttribute("user", user);
		User u = new User();
		u.setName("小额");
		request.setAttribute("user", u);
		return "rest/userList";
	}
}
