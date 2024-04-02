package challenger_employees.entities;

public class Address {
	
	private String email;
	private String prhone;
	
	
	
	
	public Address() {
		
	}
	
	public Address(String email, String prhone) {
		
		this.email = email;
		this.prhone = prhone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPrhone() {
		return prhone;
	}


	public void setPrhone(String prhone) {
		this.prhone = prhone;
	}


	
	

}
