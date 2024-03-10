package org.dnyanyog.dto;

public class Customer {

	private int age;
	private String gender;
	private int discount;
	private String festiveSeason;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getFestiveSeason() {
		return festiveSeason;
	}

	public void setFestiveSeason(String festiveSeason) {
		this.festiveSeason = festiveSeason;
	}

	@Override
	public String toString() {
		return "Customer [age=" + age + ", discount=" + discount + ", gender=" + gender + "]";
	}

	

}
