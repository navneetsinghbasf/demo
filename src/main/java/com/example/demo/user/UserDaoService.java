package com.example.demo.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;


@Component
public class UserDaoService {
	private static List<UserDetails> users = new ArrayList<UserDetails>();
	
	static{
		users.add(new UserDetails(1, "Navneet", new Date()));
		users.add(new UserDetails(2, "Pratisha", new Date()));
		users.add(new UserDetails(3, "Ravi", new Date()));
	}
	

	public List<UserDetails> getAll(){
		return users;
	}
	
	
	
}
