package adminModule;

import java.util.ArrayList;
import java.util.List;

public class Admin extends Systemuser {

	private List<Landlord> landlords = new ArrayList();
	private List<Tenant> tenants = new ArrayList<>();
	
//	Landlord landlord1 = new Landlord();
	

	public void addLandlord(Landlord landlord) {

		this.landlords.add(landlord);
		System.out.println("Adding one landlord");

	}
	
	public void addLandlord(Landlord Landlord, boolean isVipLandlord) {
		System.out.println("Adding one Vip landlord");
	}
	
	public void addLandlord(List<Landlord> Landlords) {
		System.out.println("Adding list of landlords");
	}

	public void viewLandlords() {
		if(landlords.isEmpty()) {
			throw new LandlordNotFoundException();
		}

	}

	public void updateLandlord() {

	}

	public void deleteLandlord() {

	}

	public void addTenant(Tenant tenant) {

	}
	
	public void addTenant(List<Tenant> tenants) {

	}
	
	public void addTenant(Tenant tenant,boolean isVipTenant) {

	}
	
	public void viewTenants() {
		if(tenants.isEmpty()) {
			throw new TenantNotFoundException();
		}

	}

	public void updateTenant() {

	}

	public void deleteTenant() {

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
		Admin admin = new Admin();
//		try {
//			admin.viewLandlords();
//		} catch (LandlordNotFoundException e) {
//			System.err.println("Currently, their are no landlords");
//		}
//		System.out.println("yo");
		
		try {
			admin.viewTenants();
		} catch (TenantNotFoundException e) {
			System.err.println("Currentlly, their are not tenants");
		}
	}

}
