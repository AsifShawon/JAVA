

public class GenericFunction {
   
	 static <T> void display(T[] data){
		int i;
		for(i=0;i<data.length;i++)
			System.out.print(data[i]+"   ");
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		Integer a[] = {10,2,25,1,15};
		Double d[] = {10.34,200.5,25.321,1.2,15.763};
		String s[] = {"Dhaka","Chittagong","Rajshahi","Khulna"}; 
		Student stu[] = {new Student("Faisal",1,3.5),new Student("Monir",2,3.7),new Student("Asif",3,3.6)};
		
		display(a);
		display(d);
		display(s);
		display(stu);		
	
}
}