package com.niit.service;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.niit.domain.Admin;
import com.niit.domain.User;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtSecurityTokenGeneratorImpl implements SecurityTokenGenerator {

	@Override
	public Map<String, String> generateToken(User user) {
		
		String jsonwebToken=null;
		
		JwtBuilder jwtBuilder=Jwts.builder();
		jsonwebToken=jwtBuilder.setSubject(user.getUsername()).setIssuedAt(new Date()).signWith(SignatureAlgorithm.HS256,"secret").compact();
		
		Map<String,String> tokenMap=new HashMap<String,String>();
		tokenMap.put("token", jsonwebToken);
		tokenMap.put("message", "User Successfully LoggedIn");
		
		return tokenMap;
	}

	@Override
	public Map<String, String> generateToken1(Admin admin) {

		String jsonwebToken=null;

		JwtBuilder jwtBuilder=Jwts.builder();
		jsonwebToken=jwtBuilder.setSubject(admin.getName()).setIssuedAt(new Date()).signWith(SignatureAlgorithm.HS256,"secret").compact();

		Map<String,String> tokenMap=new HashMap<String,String>();
		tokenMap.put("token", jsonwebToken);
		tokenMap.put("message", "Admin Successfully LoggedIn");

		return tokenMap;
	}

}
