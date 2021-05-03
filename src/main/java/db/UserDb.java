package db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.User;

public class UserDb {
	
	public static List<User>  usersData;
	
	public static Map<String, User> userProfile=new HashMap<String,User>();
	public static Map<String, String> newrecipy=new HashMap<String,String>();
	public static String getRecipy(String name)
	{
		for (Map.Entry<String, String> set : newrecipy.entrySet()) {
		   if(name.equals(set.getKey()))
		   {
			   return set.getValue();
		   }
		}
		return "No SUch Recipy ! But Lets create one what do you say :)";
	}
	
	public static Map<String, String> getAllRecipies()
	{
		//System.out.println(newrecipy);
		return newrecipy;
	}
	public UserDb(){
		
		User u1=new User("A","P","1234","a.p@devops.com");
		User u2=new User("P","R","abcd","p.r@devops.com");
		User u3=new User("R","S","pqrs","r.s@devops.com");
	
		
		userProfile.put(u1.getEmail(), u1);
		userProfile.put(u2.getEmail(), u2);
		userProfile.put(u3.getEmail(), u3);
		
		newrecipy.put("Vanila", "Milk & Cream");
		newrecipy.put("Strawberry", "Milk,Berry & Cream");
		newrecipy.put("Greylick", "Milk,Egg,Sugar & Cream");
		
	}
	


}
