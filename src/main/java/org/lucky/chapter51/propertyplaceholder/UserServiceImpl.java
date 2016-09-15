package org.lucky.chapter51.propertyplaceholder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
	@Value("${my.name}")
	private String name;
	@Value("${my.hobby}")
	private String hobby;

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getHobby() {
		return this.hobby;
	}
}
