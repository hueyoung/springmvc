package springmvc.controller;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import springmvc.common.MySqlSessionFactory;
import springmvc.po.User;

@Controller
@RequestMapping("api")
public class MyBatisController {
	
	@ResponseBody
	@RequestMapping(value="user", method=RequestMethod.GET, params="json")
	public List<User> select() {
		SqlSession session = null;
		List<User> user = null;
		try {
			session = MySqlSessionFactory.getInstance().openSession();
			user = session.selectList("test.findUserByName", "小");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return user;
	}
	
	@RequestMapping(value="update", method=RequestMethod.GET, params="json")
	public void update() {
		SqlSession session = null;
		try {
			session = MySqlSessionFactory.getInstance().openSession();
			User user = new User();
			user.setName("小下");
			user.setSex("男");
			user.setAge(787);
			session.update("test.updateByName", user);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
