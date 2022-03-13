package com.niit.service;

import java.util.Map;

import com.niit.domain.Admin;
import com.niit.domain.User;

public interface SecurityTokenGenerator {
	 Map<String,String> generateToken(User user);
	Map<String,String> generateToken1(Admin admin);
}
