package springmvc.mapper;

import java.util.List;

import springmvc.po.User;

/**
 * 
 * @author 000001523
 * myBatis mapper代理
 *
 */
public interface UserMapper2 {

	public List<User> findByUserId();
	
	public void updateUser();
}
