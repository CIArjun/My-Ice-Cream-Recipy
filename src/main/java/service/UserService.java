package service;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import db.UserDb;
import model.User;

public class UserService {
	UserDb userDb;

	public UserService() {
		userDb = new UserDb();
	}

	public boolean isAuthorized(User signup) {
		boolean isValidUser = false;

		if (signup != null && signup.getEmail() != null && signup.getPassword() != null) {
			Set entrySet = UserDb.userProfile.entrySet();
			Iterator it = entrySet.iterator();

			while (it.hasNext()) {
				Map.Entry u = (Map.Entry) it.next();
				User us = (User) u.getValue();
				if ((u.getKey().equals(signup.getEmail()))&& (us.getPassword().equals(signup.getPassword()))) {
					isValidUser = true;
				}
			}
		}

		return isValidUser;
	}

	public boolean updatePassword(User user) {
		boolean isUpdated = false;
		if (user != null && user.getEmail() != null) {

			for (Map.Entry<String, User> entry : UserDb.userProfile.entrySet()) {
				if (entry.getKey().equals(user.getEmail())) {
					user.setFirstName(entry.getValue().getFirstName());
					user.setLastName(entry.getValue().getLastName());
					user.setEmail(entry.getValue().getEmail());
					user.setPassword(user.getPassword());
					entry.setValue(user);
					isUpdated = true;
					
				}
			}

		}
		return isUpdated;

	}

	public boolean doRegistration(User user) {
		boolean isCreated = false;
		if (user != null && user.getEmail() != null) {
			UserDb.userProfile.put(user.getEmail(), user);
			isCreated = true;
			System.out.println("Number of records available: " + UserDb.userProfile.size());
		}
		return isCreated;
	}

	public Map<String,String> seeRecipies() {

		
		return UserDb.getAllRecipies();
	}

	public String addRecipies(String rname, String recipy) {

		UserDb.newrecipy.put(rname,recipy);
		return rname+"----)"+ UserDb.getRecipy(rname);
	}

}
