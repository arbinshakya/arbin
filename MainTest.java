package adminModule;

import java.util.ArrayList;

public class MainTest {
	
	public static void main(String[] args) {
		
	
	
	Admin admin = new Admin();
	admin.addLandlord(new Landlord());
	admin.addLandlord(new ArrayList<>());
	admin.addLandlord(new Landlord(), true);
	
	 Systemuser systemuser;
	 systemuser = new Tenant();
	 systemuser.printUserInformation();
	 
//	 systemuser = new Systemuser();
//	 systemuser.printUserInformation();
	
	}
}