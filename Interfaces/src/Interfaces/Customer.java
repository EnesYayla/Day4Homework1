package Interfaces;

public class Customer {
	public String firstName;
	private String lastName;
	private int personalId;

	public Customer(String firstName, String lastName, int personalId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.personalId = personalId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPersonalId() {
		return personalId;
	}

	public void setPersonalId(int personalId) {
		this.personalId = personalId;
	}

}
