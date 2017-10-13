package springmvc.service.impl;

import org.springframework.stereotype.Service;

import springmvc.service.UserService;

@Service
public class UserImpl implements UserService {

	public String getName() {
		return "小黑";
	}

	public String getSex() {
		return "男";
	}

	public String getAge() {
		return "18";
	}
}
