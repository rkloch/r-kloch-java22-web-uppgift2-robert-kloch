package model;

public class UserBean {
	private String[]  userArray= {"admin", "admin2"};
	private String[]  passwordArray= {"password", "password2"};
	
	public String[] getUserArray() {
		return userArray;
	}
	public void setUserArray(String[] userArray) {
		this.userArray = userArray;
	}
	public String[] getPasswordArray() {
		return passwordArray;
	}
	public void setPasswordArray(String[] passwordArray) {
		this.passwordArray = passwordArray;
	}
	public int findUserIndex(String user) {
		for(int i = 0; i<userArray.length;  i++) {
			if(user.equals(userArray[i])) {
				return i;
			}
		}
		return -1;
	}
}
