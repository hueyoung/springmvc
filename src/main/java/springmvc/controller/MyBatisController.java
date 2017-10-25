package springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import springmvc.dao.UserDao;
import springmvc.po.User;

@Controller
@RequestMapping("api")
public class MyBatisController {
	
	@Autowired
	private UserDao<User> userDao;
	
	@ResponseBody
	@RequestMapping(value="user", method=RequestMethod.GET, params="json")
	public List<User> select() {
		return userDao.findByUserId();
	}
	
	@RequestMapping(value="update", method=RequestMethod.GET, params="json")
	public void update() {
		userDao.updateUser();
	}
}
