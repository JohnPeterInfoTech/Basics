package org.university;

public class College extends University{

	
	public void ug(String Stnd) {
		System.out.println("Student UG : "+Stnd);
		
	}
	@Override
	public void pg(String Degree) {
	System.out.println("Student PG :" +Degree);
		
	}
	public static void main(String[] args) {
		College c =new College();
		c.ug("BCA");
		c.pg("MCA");
	}	
}
