
// creating a generic class

class MyGEnerics<T1>{ // T1 is a type, that can be like String, Integer, or any data type
	private int value;
	private T1 t1; // t1 is a variable of T1 data type
	
	public MyGEnerics() {} // blank constructor
	public MyGEnerics(int value, T1 t1) {
		this.value = value;
		this.t1 = t1;
	}
	
	// getters and setters
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public T1 getT1() {
		return t1;
	}
	public void setT1(T1 t1) {
		this.t1 = t1;
	}
}

// creating another custom generic with multiple data type

class MyGEnerics2<T1,T2>{ // T1 is a type, that can be like String, Integer, or any data type
	private int value;
	private T1 t1; // t1 is a variable of T1 data type
	private T2 t2;
	
	public MyGEnerics2() {} // blank constructor
	public MyGEnerics2(int value, T1 t1,T2 t2) {
		this.value = value;
		this.t1 = t1;
		this.t2 = t2;
	}
	
	// getters and setters
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public T1 getT1() {
		return t1;
	}
	public void setT1(T1 t1) {
		this.t1 = t1;
	}
	public T2 getT2() {
		return t2;
	}
	public void setT2(T2 t2) {
		this.t2 = t2;
	}
}

public class CustomGenerics {
	public static void main(String[] args) {
		
		// calling MyGEnerics with String data type, that means T1 = String
		MyGEnerics<String> g1 = new MyGEnerics(76, "Shawon ");
		System.out.println(g1.getT1()+g1.getValue());
		
		// calling MyGEnerics with Integer data type, that means T1 = Integer
		MyGEnerics<Integer> g2 = new MyGEnerics(20,40);
		System.out.println(g2.getT1()+g2.getValue());
		
		// calling MyGEnerics2 with Integer, String data type, that means T1 = Integer, T2 = String
		MyGEnerics2<Integer,String> g3 = new MyGEnerics2(5, 10, "Additon ");
		System.out.println(g3.getT2()+(g3.getValue()+g3.getT1()));
	}
}
