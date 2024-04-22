package pack_model;

import java.util.List;
import java.util.Random;

public class user {
	private String user_name;
	private String password;
	private String userID;
	private List<category> list_categories; 

	public user() {
	}

	public user(String user_name, String password) {
		this.user_name = user_name;
		this.password = password;
		generateRandomString();
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserID() {
		return userID;
	}

	public void generateRandomString() {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		String randomString = null;

		Random random = new Random();
		for (int i = 0; i < 9; i++) {
			int index = random.nextInt(characters.length());
			char randomChar = characters.charAt(index);
			randomString += randomChar;
		}
		this.userID = randomString;
	}
	
	public List<category> getList_categories() {
		return list_categories;
	}

	public void setList_categories(List<category> list_categories) {
		this.list_categories = list_categories;
	}
}
