

class GenAvg<T extends Number>{
	T nums[];
	GenAvg(T val[]){
		nums = val;
	}
	double average(){
		double sum=0;
		for(int i=0;i<nums.length;i++)
			sum += nums[i].doubleValue();
		return sum/nums.length;
	}
}


public class GenericsAverage {
	public static void main(String[] args) {
		Integer a[] = {10,2,25,1,15};
		Float f[] = {1.5F,2.5F,3.5F};
		Double d[] = {10.34,200.5,25.321,1.2,15.763};
		//String s[] = {"Dhaka","Chittagong","Rajshahi","Khulna"}; 
		
		GenAvg<Integer> objInt = new GenAvg<> (a);
		System.out.println(objInt.average());
		
		GenAvg<Float> objFloat = new GenAvg<> (f);
		System.out.println(objFloat.average());
		
		GenAvg<Double> objDouble = new GenAvg<> (d);
		System.out.println(objDouble.average());
		
		//GenAvg<String> objString = new GenAvg<> (s);
	}

}
