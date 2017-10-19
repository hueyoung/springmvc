package springmvc.common;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlSessionFactory {
	
	private static SqlSessionFactory factory;

	public static SqlSessionFactory getInstance() {
		if (factory == null) {
			synchronized (MySqlSessionFactory.class) {
				if (factory == null) {
					try {
						Reader reader = Resources.getResourceAsReader("mybatisConfig.xml");
						factory = new SqlSessionFactoryBuilder().build(reader);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		return factory;
	}
}
