package adminModule;

import java.time.LocalDate;

public class StudentTypeTenant extends Tenant {

	private String collegeName;
	private String courseEnrolled;
	private String collegeIdenty;
	private String grade;

	public static void main(String[] args) {
		
		Tenant tenant = new Tenant();
		
		tenant.displayTenantInformation();
		System.out.println("sad");
	}
	
	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCourseEnrolled() {
		return courseEnrolled;
	}

	public void setCourseEnrolled(String courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}

	public String getCollegeIdenty() {
		return collegeIdenty;
	}

	public void setCollegeIdenty(String collegeIdenty) {
		this.collegeIdenty = collegeIdenty;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public void displayTenantInformation() {
		// TODO Auto-generated method stub
		super.displayTenantInformation();
		System.out.println("college name: " + getCollegeName() );
	}



}
