package springmvc.dao;

import java.util.List;

/**
 * 
 * @author 000001523
 * myBatis dao操作
 *
 */
public interface UserDao<T> {

	public List<T> findByUserId();
	
	public void updateUser();
}
