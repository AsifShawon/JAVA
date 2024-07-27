package Abstract_basic;

public class Main {
	public static void main(String[] args) {
		Lion lion = new Lion("ABC","African"); /*lion is an object of "Lion" class*/
		Tiger tiger = new Tiger("DEF","Royal");
		
		lion.Sound();
		tiger.Sound();
	}
}