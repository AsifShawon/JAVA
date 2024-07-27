
public abstract class Person {
	private String userName;
	private String name;
	private String phoneNumber;
	private String email;
	private String dateOfBirth;
	
	
	public Person(String userName,String name,String phoneNumber,String email,String dateOfBirth)
	{
		this.userName=userName;
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.email=email;
		this.dateOfBirth=dateOfBirth;
		
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	@Override
	public String toString() {
		return "Person [userName=" + userName + ", name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	

}
