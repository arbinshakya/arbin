package adminModule;

import java.time.LocalDate;

public class FamilyTypeTenant extends Tenant {

	private String wifeName;
	private int numofChildren;
	private boolean marriedCertificate;
	
	public static void main(String[] args) {
		
		Tenant tenant = new Tenant();
		
		tenant.displayTenantInformation();
		System.out.println("sad");
	}
	
	public String getWifeName() {
		return wifeName;
	}

	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}

	public int getNumofChildren() {
		return numofChildren;
	}

	public void setNumofChildren(int numofChildren) {
		this.numofChildren = numofChildren;
	}

	
	public boolean isMarriedCertificate() {
		return marriedCertificate;
	}

	public void setMarriedCertificate(boolean marriedCertificate) {
		this.marriedCertificate = marriedCertificate;
	}

	@Override
	public void displayTenantInformation() {
		// TODO Auto-generated method stub
		super.displayTenantInformation();
		System.out.println("family number: " + (getNumofChildren()+2) );
	}
	
	


}
