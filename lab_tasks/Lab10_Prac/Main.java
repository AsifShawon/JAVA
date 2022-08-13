package Lab10_Prac;

import java.util.Scanner;

public class Main {
	
	static void add(Plant[] plant, Plant p) {
		for(int i=0; i<10; i++) {
			if(plant[i]==null) {
				plant[i] = new Plant(p.getName(),p.getColor());
				break;
			}
		}
	}
	
	static void remove(Plant[] plant,String n) {
		for(int i=0; plant[i]!=null; i++) {
				if(plant[i].getName().equals(n)) {
					plant[i] = plant[i+1];
					for(int j=i+1; plant[j]!=null; j++) {
						plant[j] = plant[j+1];
					}
				}
				break;
		}
	}
	
	static Plant search(Plant [] plant, String n) {
		for(int i=0; i<10; i++) {
			if(plant[i].getName()!=null) {
				if(plant[i].equals(n)) return plant[i];
			}
		}
		return null;
	}
	
	static void display(Plant [] plant) {
		for(int i=0; i<10; i++) {
			if(plant[i]!=null) System.out.println(plant[i]);
		}
	}
	
	public static void main(String[] args) {
		Plant[] plant = new Plant[10];
		
		Scanner s = new Scanner(System.in);
		String name,color;
		
		boolean run = true;
		
		while(run) {
			System.out.println("Enter choice");
			System.out.println("1. add");
			System.out.println("2. remove");
			System.out.println("3. search");
			System.out.println("4. display");
			System.out.println("5. exit");
			
			int c = s.nextInt();
			switch(c) {
			case 1:
				System.out.print("Enter name and color:");
				name = s.next();
				color = s.next();
				Plant p = new Plant(name, color);
				add(plant,p);
				break;
			case 2:
				System.out.print("Enter name:");
				name = s.next();
				remove(plant,name);
				break;
			case 3:
				System.out.print("Enter name:");
				name = s.next();
				System.out.println(search(plant,name));
				break;
			case 4:
				display(plant);
				break;
			default:
				System.out.println("Thanks");
				run = false;
			}
		}

	}

}
