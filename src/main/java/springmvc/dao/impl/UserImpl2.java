package springmvc.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import springmvc.common.MySqlSessionFactory;
import springmvc.dao.UserDao;
import springmvc.po.User;

/**
 * FIXME 这里之所有用userImpl2是因为使用注入注解与service包下面的冲突了
 * @author 000001523
 *
 */
@Service
public class UserImpl2 implements UserDao<User>{

	public List<User> findByUserId() {
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

	public void updateUser() {
		SqlSession session = null;
		try {
			session = MySqlSessionFactory.getInstance().openSession();
			User user = new User();
			user.setName("小下");
			user.setSex("女");
			user.setAge(101);
			session.update("test.updateByName", user);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
}
