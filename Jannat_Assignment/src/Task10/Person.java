package Task10;

import Task6.Address;

public class Person {
    private String fullName;
    private String gender;
    private String phoneNum;
    private String email;
    private Address presentAddress;
    private Address permanentAddress;

    // Constructor
    public Person(String fullName, String gender, String phoneNum, String email, Address present, Address permenant) {
        this.fullName = fullName;
        this.gender = gender;
        this.phoneNum = phoneNum;
        this.email = email;
        this.presentAddress = present;
        this.permanentAddress = permenant;
    }

    // Getters
    public String getFullName() {
        return fullName;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public Address getPresentAddress() {
        return presentAddress;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    // Setters
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPresentAddress(Address presentAddress) {
        this.presentAddress = presentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    // toString method
    @Override
    public String toString() {
        return "Personal Info\n" +
                "Full Name= " + fullName +
                "\nGender= " + gender +
                "\nPhone Num= " + phoneNum +
                "\nEmail= " + email + 
                "\nPresent Address: " + presentAddress +
                "\nPermanent Address: " + permanentAddress;
    }
}

