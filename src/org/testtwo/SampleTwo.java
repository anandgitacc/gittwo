package org.testtwo;

public class SampleTwo {
	
	public void empName() {
		System.out.println("Employee name is Anand");
	}
	
	public void empMobno() {
		System.out.println("Employee mobile no is 8667070832");
	}
	
	public void empAdd() {
		System.out.println("Employee Add is Chennai");
	}
	
	private void empBike() {
		System.out.println("Employee bike is Royal Enfield");
	}
	
	public static void main(String[] args) {
		
		SampleTwo a = new SampleTwo();
		
		a.empName();
		a.empMobno();
		a.empAdd();
		a.empBike();
	}

}
