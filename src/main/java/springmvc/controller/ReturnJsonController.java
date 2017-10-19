package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import springmvc.service.UserService;
import springmvc.service.impl.UserImpl;
/**
 * 
 * @author 000001523
 * 返回json字符串
 *
 */
@Controller
@RequestMapping("api")
public class ReturnJsonController {
	
	@Autowired
	UserService user;
	
	@ResponseBody
	@RequestMapping(value="detail", method=RequestMethod.GET, params="json")
	public UserImpl json() {
		UserImpl user = (UserImpl)this.user;
		return user;
	}
}
