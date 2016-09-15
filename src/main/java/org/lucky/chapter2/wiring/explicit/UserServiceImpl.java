package org.lucky.chapter2.wiring.explicit;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
	private UserDao userDao;

	UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
}
