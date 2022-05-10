package org.add;

public class GreensTech {

	public void greensOmr(String instituteName) {
		System.out.println("Institute Name: " + instituteName);
	}

	public void greensOmr(String instituteName, String address) {
		System.out.println("Institute Name: " + instituteName+ ", Address: " + address);
	}

	public void greensOmr(int courseFess, int discountFees, String certificateFees) {
		System.out.println("Course Fees: " + courseFess + ", Discount Fees: " + discountFees
				+ ", Certificate Fees: " + certificateFees);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreensTech greensTech = new GreensTech();
		greensTech.greensOmr("Omr Lights");
		greensTech.greensOmr("Omr Lights", "OMR Chennai");
		greensTech.greensOmr(10000, 9000, "75000");
	}

}
