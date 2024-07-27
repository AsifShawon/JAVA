package Ratib;

import java.util.Date;
import java.util.Scanner;

public class Assignment {
	static Scanner sc = new Scanner(System.in);
	static Scanner in = new Scanner(System.in);
	
	static String[] course = new String[100];
	static int course_len = 0;
	static int section = 6;
    static Date[] day = new Date[100];
    static String[] d = new String[100];
    static String[] teacher_initial = new String[100];
    static int[] assigned = new int[100];
    static int stu_num = 0;
    static int[][] student_info = new int[100][100]; // [id,course_number, ...course_index]
    
	
	@SuppressWarnings("deprecation")
	static void setCourseTime(int i,int d,int h,int m) {
			day[i] = new Date(122, 10, d, h, m);
    }
	
	static void addCourse() {
		System.out.print("Subject code: ");
		course[course_len] = in.next();
		System.out.println("Choose timing");
		System.out.println("1. RA -> 8.00-9.30");
		System.out.println("2. RA -> 9.40-11.10");
		System.out.println("3. ST -> 8.00-9.30");
		System.out.println("4. ST -> 9.40-11.10");
		System.out.println("5. MW -> 8.00-9.30");
		System.out.println("6. MW -> 9.40-11.10");
		int sec = sc.nextInt();
		
		if(sec==1) {
			setCourseTime(course_len, 5, 8, 0);
			d[course_len] = "RA[8:00-9:30]";
		}
		else if(sec==2) {
			setCourseTime(course_len, 5, 9, 40);
			d[course_len] = "RA[9:40-11:10]";
		}
		else if(sec==3) {
			setCourseTime(course_len, 6, 8, 0);
			d[course_len] = "ST[8:00-9:30]";
		}
		else if(sec==4) {
			setCourseTime(course_len, 6, 9, 40);
			d[course_len] = "ST[9:40-11:10]";
		}
		else if(sec==5) {
			setCourseTime(course_len, 7, 8, 0);
			d[course_len] = "MW[8:00-9:30]";
		}
		else if(sec==6) {
			setCourseTime(course_len, 7, 9, 40);
			d[course_len] = "MW[9:40-11:10]";
		}
		
		System.out.println("Enter teacher Initial: ");
		teacher_initial[course_len] = in.next();
		
		course_len++;
		
	}
	
	static void admin() {
		System.out.println("Select: ");
		System.out.println("1. Add Course");
		int choice = sc.nextInt();
		if(choice==1) addCourse();
	}
	
	static void teacher() {
		System.out.println("Enter initial: ");
		String initial = in.next();
		
		int[] index = new int[100];
		int j=0;
		boolean found = false;
		for(int i=0; i<course_len; i++) {
			if(teacher_initial[i].compareTo(initial)==0) {
				found = true;
				index[j] = i;
				j++;
			}
		}
		if(found==false) {
			System.out.println("Sorry not Found!");
			whoAreYou();
		}
		System.out.println("Course\tTiming\tStudents");
		for(int i=0; i<j; i++) {
			System.out.println(course[index[i]]+"\t"+d[index[i]]+"\t"+assigned[index[i]]);
		}
		
	}
	
	static boolean checkTiming(int index1, int index2) {
		
		for(int i=2; i<student_info[index1][1]; i++) {
			if(course[student_info[index1][i]].compareTo(course[index2]) && d[student_info[index1][i]].compareTo(d[index2])) {
				return false;
			}
		}
		
		return false;
		
	}
	
	static void enrollCourse() {
		System.out.println("Enter your id: ");
		int id = sc.nextInt();
		
		System.out.println("Choose your course: ");
		System.out.println("Course\tTiming\tSeat");
		for(int i=0; i<course_len; i++) {
			System.out.println((i+1)+". "+course[i]+"\t"+d[i]+"\t"+(35-assigned[i]));
		}
		
		int course_ind = sc.nextInt();
		int index=stu_num;
		assigned[course_ind-1]++;
		boolean found = false;
		for(int i=0; i<stu_num; i++) {
			if(student_info[i][0]==id) {
				found=true;
				index = i;
				break;
			}
		}
		
		
		if(!found) student_info[index][0] = id;
		
		if(student_info[index][1]==0) {
			student_info[index][1]=1;
		}

		student_info[index][1]++;
		student_info[index][student_info[index][1]] = course_ind;
		
//		check
		
		stu_num++;
	}
	
	static void deleteEnrolledCourse() {
		
	}
	
	static void student() {
		System.out.println("Enter Your choice");
		System.out.println("1. Enroll");
		System.out.println("2. Delete Course");
		int choice = sc.nextInt();
		
		if(choice==1) enrollCourse();
		else deleteEnrolledCourse();
	}
	
	static void whoAreYou() {
		System.out.println("Enter your choice");
		System.out.println("1. Student");
		System.out.println("2. Teacher");
		System.out.println("3. Admin");
		int choice = sc.nextInt();
		
		if(choice==1) student();
		else if(choice==2) teacher();
		else admin();
	}

    public static void main(String[] args) {
        while(true) {
        	whoAreYou();
        }
    }
	
}
