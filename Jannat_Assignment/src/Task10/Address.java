package Task10;

public class Address {
    private int houseNum;
    private int roadNum;
    private String city;
    private String country;
    private int postalCode;

    // Constructor
    public Address(int houseNum, int roadNum, String city, String country, int postalCode) {
        this.houseNum = houseNum;
        this.roadNum = roadNum;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
    }

    // Getters
    public int getHouseNum() {
        return houseNum;
    }

    public int getRoadNum() {
        return roadNum;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getPostalCode() {
        return postalCode;
    }

    // Setters
    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public void setRoadNum(int roadNum) {
        this.roadNum = roadNum;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    // toString method
    @Override
    public String toString() {
        return "House Num= " + houseNum +
                ", Road Num= " + roadNum +
                ", City= " + city + 
                ", Country= " + country + 
                ", Postal Code= " + postalCode;
    }
}

