package Question_1;

public class NextSemester {
    private String name;
    private int year;
    
    public NextSemester() {
    	
    }

    public NextSemester(String name, int year) {
        this.name = name;
        this.year = year;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setYear(int year) {
    	this.year = year;
    }

    public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public void display() {
        System.out.println(name + " " + year);
    }

    public int calculate() {
        int sum = 0;
        int temp = year;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }
}
