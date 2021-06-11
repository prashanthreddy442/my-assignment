package dto;

import java.io.Serializable;

public class RegisterDto implements Serializable{

	private String name;
	private String contactNumber;
	private String email;
	private String country;
	public RegisterDto() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "RegisterDto [name=" + name + ", contactNumber=" + contactNumber + ", email=" + email + ", country="
				+ country + "]";
	}
	
}