package com.pratiti.training.collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

class User
{
	String username ;
	String password;
	
	User (String username,String password)
	{
		this.username=username;
		this.password = password;
	}
	
	
	
}

class UserManager{
	
	private Map<String,String> users;
	
	UserManager()
	{
		users=new HashMap<>();
		users.put("rutvik","123456");
		users.put("rohit","123457");
		users.put("pratik","123458");
	}
	
	boolean isValidUser(String username,String password)
	{
		if(users.containsKey(username))
			if(users.get(username).equals(password))
				return true;
		return false;
//		for(Map.Entry<String, String> user: users.entrySet() )
//		{
//			String name=user.getKey();
//			String passwor=user.getValue();
//			if(name.equals(username) && passwor.equals(password))
//				return true;
//		}
//		return false;
		
	}
}







public class Scenario2 {
	
	public static void main(String[] args) {
		
		UserManager mgr=new UserManager();
		boolean isValid=mgr.isValidUser("rutvik", "123458");
		if(isValid)
			System.out.println("LOgged in");
		else
			System.out.println("invalid username password");
	}
	
}
