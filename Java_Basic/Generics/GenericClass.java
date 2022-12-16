
class Gen<T>{
	T data;
	Gen(T i){
		data = i;
	}
	T getVal(){
		return data;
	}
}

public class GenericClass {
	public static void main(String[] args) {
		
		Gen<Integer> obj1 = new Gen<Integer> (25);
		int a = obj1.getVal();
		System.out.println(a);
		Gen<Double> obj2 = new Gen<> (520.75);
		double d = obj2.getVal();
		System.out.println(d);
		Gen<String> obj3 = new Gen<> ("Dhaka");
		String s = obj3.getVal();
		System.out.println(s);
		Gen<Student> obj4 = new Gen<> (new Student("Monir",1,3.5));
		Student stu = obj4.getVal();
		System.out.println(stu);
	}

}
