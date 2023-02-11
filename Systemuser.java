package adminModule;

import java.util.regex.Pattern;

public abstract class Systemuser {
	private String username;
	private String password;
	private static final String regexForEmailId= "^([A-Za-z0-9[(!#$%&*--/]+]+@{1}(heraldCollege[.]edu[.]np|heraldcollegekathmandu[.]com))$";
	private static final String regexForPassword= "^([A-Za-z0-9[(!#$%&*--/]+]+)$";
//	private static final String mobileNumber = "^\\+977-[9][\\d]{9}$";
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(Pattern.matches(regexForPassword, password)) {
			
		this.password = password;
		}else {
			System.out.println("Password invalid");
		}
	}
	public void printUserInformation() {
		System.out.println("UserName: "+ this.username);
		System.out.println("Password: "+ this.password);
		
	}
	public abstract void login();
	public abstract void logout();
	
}
