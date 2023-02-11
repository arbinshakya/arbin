package adminModule;

import java.time.LocalDate;

public class PaymentBills {
	private int electricityCharge;
	private int waterCharge;
	private int damageCharge;
	private LocalDate issueDate;
	
	
	public int getElectricityCharge() {
		return electricityCharge;
	}
	public void setElectricityCharge(int electricityCharge) {
		this.electricityCharge = electricityCharge;
	}
	public int getWaterCharge() {
		return waterCharge;
	}
	public void setWaterCharge(int waterCharge) {
		this.waterCharge = waterCharge;
	}
	public int getDamageCharge() {
		return damageCharge;
	}
	public void setDamageCharge(int damageCharge) {
		this.damageCharge = damageCharge;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(int year,int month,int day) {
		this.issueDate = LocalDate.of(year, month, day);
	}
	
	

}
