package springmvc.bean;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class User {

	private String name;
	
	private String sex;
	
	private int age;

	/**
	 * 使用该注解需要注意的是：
	 * 1.notNull和notEmpty有区别
	 * 2.返回的时候不能重定向
	 * 3.添加maven路径的时候添加的是hibrnate
	 */
	@NotEmpty(message="姓名不能为空！")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Range(max=60, min=18, message="年龄必须在18~60岁之间！")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
