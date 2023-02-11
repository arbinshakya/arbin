package adminModule;

import java.time.LocalDate;
import java.util.List;

public class Tenant extends Systemuser implements TenantRignts {

	private String name;
	private LocalDate DOB;
	private int roomNumber, rentDuration;
	
	private Address address;
	private List<Report> report;
	private List<PropertyDetails> propertyDetails;
	private List<PaymentBills> bill;
	private ContactDetails contactDetails;

	@Override
	public String toString() {
		return "Tenant [getUsername()=" + getUsername() + ", getPassword()=" + getPassword() + "]";
	}
	
	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(int year, int month, int day) {
		this.DOB = LocalDate.of(year, month, day);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public List<Report> getReports() {
		if(report == null) {
			throw new ReportNotFoundException();
		}else {
			
		return report;
		}
	}

	public void setReports(Report reports) {
		this.report.add(reports);
	}
	
	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}
	
	

	@Override
	public void printUserInformation() {
		// TODO Auto-generated method stub
		super.printUserInformation();
		System.out.println("Tenant name: "+this.name);
	}

	public void viewRoomDetails() {
//		landlord.giveDetails();

	}

	public void selectproperty() {

	}

	public void bookRoom(int roomNumber, int rentDuration) {
		this.roomNumber = roomNumber;
		this.rentDuration = rentDuration;

	}
	
	public void displayTenantInformation() {
		System.out.println("Tenant Name: "+this.name);
		
	}

	public void contractLandlord() {

	}

	public void changeRoom(int roomNumber) {

	}
	public void viewbill() {
		if(bill == null) {
			throw new TenantBillNotFoundException();
		}

	}

//	public void changeProperty(String location, int roomNumber, int rentDuration) {
//		this.location = location;
//		this.roomNumber = roomNumber;
//		this.rentDuration = rentDuration;
//	}

	public void payRent() {

	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Tenant tenant = new Tenant();
		PaymentBills bill = new PaymentBills();
		Report report = new Report();
		try {
			tenant.setName("ram");
			tenant.getName();
		} catch (NullPointerException e) {
			System.err.println("cannot access null object.");
		}
		System.out.println("SAd");
		
		try {
			tenant.viewbill();
		} catch (TenantBillNotFoundException e) {
			System.err.println("Your bill is not created by landlord.");
		}
		try {
			tenant.getReports();
		} catch (ReportNotFoundException e) {
			System.err.println("no Reports generated!");
		}
	}

	@Override
	public void canLeaveTheRentRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RequestLandlordForLatePayment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ReviewLandlordBehaviors() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ReviewRentOfProperty() {
		// TODO Auto-generated method stub
		
	}

}
