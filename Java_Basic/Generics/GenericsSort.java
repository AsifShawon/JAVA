
class GenSort<T extends Comparable<T>>{
	T data[];
	GenSort(T val[]){
		data = val;
	}
	void sort(){
		int i,j,n;
		T temp;
		n = data.length;
		
		for(i=0;i<n-1;i++)
			for(j=i+1;j<n;j++)
			{
				if(data[i].compareTo(data[j])>0)
				{
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		
		for(i=0;i<data.length;i++)
			System.out.print(data[i]+"  ");
		System.out.println();
	}
	
}


public class GenericsSort {
	public static void main(String[] args) {
		Integer a[] = {10,2,25,1,15};
		Double d[] = {10.34,200.5,25.321,1.2,15.763};
		String str[] = {"Dhaka","Chittagong","Rajshahi","Khulna"}; 
		
		GenSort<Integer> objInt = new GenSort<> (a);
		objInt.sort();
		
		GenSort<Double> objDouble = new GenSort<> (d);
		objDouble.sort();
	
		GenSort<String> objString = new GenSort<> (str);
		objString.sort();
		
		Student stu[] = {new Student("Asif",3,3.6),new Student("Faisal",1,3.5),new Student("Monir",2,3.7)};
		GenSort<Student> objStu = new GenSort<> (stu);
		objStu.sort();
			
	}

}
