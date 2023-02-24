package com.pratiti.training.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class UserTwo
{
	String username ;
	String password;
	
	UserTwo (String username,String password)
	{
		this.username=username;
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(password, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserTwo other = (UserTwo) obj;
		return Objects.equals(password, other.password) && Objects.equals(username, other.username);
	}
	
	
}

class UserManagerTwo{
	
	List<UserTwo> users;
	
	UserManagerTwo()
	{
		users=new ArrayList<>();
		users.add(new UserTwo("rutvik","123456"));
		users.add(new UserTwo("rohit","123457"));
		users.add(new UserTwo("pratik","123458"));
	}
	
	boolean isValidUser(String username,String password)
	{
//		for(int i=0;i<users.size();i++)
//		{
//		    User user=users.get(i);
//			if(user.username.equals(username) && user.password==password)
//				return true;
//		}
//		return false;
//		for(User user: users)
//		{
//			if(user.username.equals(username) && user.password==password) {
//				return true;
//			}
////				
//		}
//		return false;
		
		UserTwo user=new UserTwo(username,password);
		return users.contains(user);
		
		
		
		
	}
}







public class UsageOfCollections {
	
	public static void main(String[] args) {
		
		UserManagerTwo mgr=new UserManagerTwo();
		boolean isValid=mgr.isValidUser("rutvik", "123456");
		if(isValid)
			System.out.println("LOgged in");
		else
			System.out.println("invalid username password");
	}
	
}
