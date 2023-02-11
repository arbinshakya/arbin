package adminModule;

public class TenantBillNotFoundException extends RuntimeException {

	public TenantBillNotFoundException() {
		super("Bill not found.");
	}

	
}
