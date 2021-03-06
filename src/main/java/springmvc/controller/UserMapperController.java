package springmvc.controller;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import springmvc.common.MySqlSessionFactory;
import springmvc.mapper.UserMapper2;
import springmvc.po.User;

@Controller
@RequestMapping("api")
public class UserMapperController {
	
	@ResponseBody
	@RequestMapping(value = "list", params = "json")
	public List<User> list() {
		SqlSession session = MySqlSessionFactory.getInstance().openSession();
		UserMapper2 userMapper = session.getMapper(UserMapper2.class);
		List<User> list = userMapper.findByUserId();
		session.close();
		return list;
	}
}
