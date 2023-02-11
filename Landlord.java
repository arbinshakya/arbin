package adminModule;

public class Landlord extends Systemuser {

	private String name;
	private String location;
	private int numberOfRooms;
	private String mobileNumber;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public void giveDetails(int roomNumber,int floor,int rentalCharge,String location,String landlordName) {
		
	}

	@Override
	public void login() {
		System.out.println("Login sucess");
		
	}

	@Override
	public void logout() {
		System.out.println("Logout sucess"); 
		
	}
}
