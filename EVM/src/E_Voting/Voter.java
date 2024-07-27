package E_Voting;

import java.io.Serializable;

public class Voter implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name, phnum, dept, email, dob, address, id;
	
	public Voter() {}
	
	public Voter(String name, String id, String phnum, String dept, String email, String dob, String address) {
		this.name = name;
		this.id = id;
		this.phnum = phnum;
		this.dept = dept;
		this.email = email;
		this.dob = dob;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhnum() {
		return phnum;
	}

	public void setPhnum(String phnum) {
		this.phnum = phnum;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return name + "\t" + id + "\t" + phnum + "\t" + dept + "\t" + email + "\t" + dob + "\t" + address;
	}
}
