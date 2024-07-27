import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Scanner in = new Scanner(System.in);
    static String[][] student = {{"S1","password","A"},
            {"S2","password","B"},
            {"S3","password","C"}};
    static String[][] teacher = {{"T1","password","A"},
            {"T2","password","B"}};
    static String[][] courses = {{"Course A","1","A","T1"},
            {"Course A","2","A","T2"},
            {"Course A","3","B","T1"},
            {"Course B","1","A","T1"},
            {"Course C","1","B","T2"},
            {"Course C","2","C","T1"}};
    static String[] course = {"Course A","Course B","Course C"};
    static String[][] taken = new String[30][4]; // 0->course 1->section 2->timing 3->student
    static int taken_ind=0;

    static void Teacher(String id,String pass) {
        int t_ind=-1;
        for(int i=0; i<teacher.length; i++) {
            if(teacher[0][0].equals(id) && teacher[0][1].equals(pass)) {
                t_ind = i;
                break;
            }
        }

        if(t_ind == -1) {
            System.out.println("Teacher not found\n");
            return;
        }

        System.out.println("Welcome Teacher "+id);
        while (true) {
            System.out.println("1: View Course | 2: Logout");
            int choice = sc.nextInt();

            if (choice == 1) {
                int ind = 1;
                int[] tc_ind = new int[30];
                for (int i = 0; i < courses.length; i++) {
                    if (courses[i][3].equals(id)) {
                        System.out.println((ind++) + ":" + courses[i][0] + "." + courses[i][1]);
                        tc_ind[ind - 1] = i;
                    }
                }
                System.out.println(ind + ":Back");
                ind = 1;
                System.out.println("Selected> ");
                choice = sc.nextInt();
                /*there will be an error if no student assign in any course of that teacher*/
                for (int i = 0; i < taken.length; i++) {
                    if (taken[i][0] != null && taken[i][0].equals(courses[tc_ind[choice - 1]][0])) {
                        System.out.println(ind++ + ") " + taken[i][0] + " " + taken[i][1] + " " + taken[i][2]);
                    }
                }
                if (ind == 1) {
                    System.out.println("No student assigned in this course");
                }
            } else return;
        }
    }

    static void Student(String id, String pass) {
        int s_ind=-1;
        for(int i=0; i<student.length; i++) {
            if(student[0][0].equals(id) && student[0][1].equals(pass)) {
                s_ind = i;
                break;
            }
        }
        if(s_ind == -1) {
            System.out.println("Student not found\n");
            return;
        }

        System.out.println("Welcome "+id);
        while (true) {
            System.out.println("1: Add Course | 2: View Course | 3: Back");
            int choice = sc.nextInt();
            if (choice == 1) {
                for (int i = 0; i < course.length; i++) {
                    System.out.print((i + 1) + ": " + course[i] + " ");
                }
                System.out.print("Course selected:> ");
                int course_ind = sc.nextInt();
                System.out.print("Section Selected:> ");
                int sec_ind = sc.nextInt();
                if (taken[0][0] == null) {
                    taken[0][0] = course[course_ind - 1];
                    taken[0][1] = String.valueOf(sec_ind);
                    int time_slot_ind = -1;
                    for (int i = 0; i < courses.length; i++) {
                        if (courses[i][0].equals(course[course_ind - 1]) && courses[i][1].equals(String.valueOf(sec_ind))) {
                            taken[0][2] = courses[i][2];
//                        System.out.println(taken[0][2] + " "+courses[i][2]);
                            break;
                        }
                    }
                    taken[0][3] = id;
                    taken_ind++;
                } else {
                    // as we need to check whether the 'id' is in the 'taken' array
                    String temp_timing = "";
                    boolean sec_available = true;
                    for (int i = 0; i < courses.length; i++) {
                        if (courses[i][0].equals(course[course_ind - 1]) && courses[i][1].equals(String.valueOf(sec_ind))) {
                            temp_timing = courses[i][2];
                            break;
                        }
                        sec_available = courses[i][1].equals(String.valueOf(sec_ind));
                    }
                    if(!sec_available){
                        System.out.println("Your section is not available");
                        continue;
                    }
                    boolean available = true;
                    for (int i = 0; i < taken.length; i++) {
                        // checking whether the course is taken or not
                        if (taken[i][0].equals(course[course_ind - 1]) && taken[i][3].equals(id)) {
                            System.out.println("You've already taken this course!");
                            available = false;
                            break;
                        }
                        // checking whether the time slot is free or not
                        if (taken[i][2].equals(temp_timing) && taken[i][3].equals(id)) {
                            System.out.println("You've already taken a course in this time slot!");
                            available = false;
                            break;
                        }
                    }
                    if(available && sec_available) {
                        taken[taken_ind][0] = course[course_ind - 1];
                        taken[taken_ind][1] = String.valueOf(sec_ind);
                        taken[taken_ind][2] = temp_timing;
//                    System.out.println(temp_timing);
                        taken[taken_ind][3] = id;
                        taken_ind++;
                    }
                }
            } else if (choice == 2) {
                System.out.println("Your courses are: ");
                int ind = 1;
                int[] tt_c = new int[30];
                for (int i = 0; i < taken.length; i++) {
                    if (taken[i][3] != null && taken[i][3].equals(id)) {
                        System.out.println(ind++ + ") " + taken[i][0] + " " + taken[i][1] + " " + taken[i][2]);
                        tt_c[ind - 1] = i;
                    }
                }
                System.out.println("1) Remove Course | 2) Back\n>");
                int c = sc.nextInt();
                if (c == 1) {
                    System.out.println("Course selected> ");
                    c = sc.nextInt();
                    for (int i = tt_c[c - 1]; i < taken.length - 1; i++) {
                        taken[i][0] = taken[i + 1][0];
                        taken[i][1] = taken[i + 1][1];
                        taken[i][2] = taken[i + 1][2];
                        taken[i][3] = taken[i + 1][3];
                    }
                } else return;

            } else {
                return;
            }
        }
    }

    public static void main(String args[]) {
        boolean run = true;
        while(run) {
            System.out.println("Who are you?");
            System.out.print("1: Student | 2: Teacher\n>");
            int choice = sc.nextInt();

            if(choice==1)/*student*/ {
                System.out.print("ID: ");
                String id = in.next();
                System.out.print("Password: ");
                String pass = in.next();
                Student(id, pass);
            }
            else /*teacher*/ {
                System.out.print("ID: ");
                String id = in.next();
                System.out.print("Password: ");
                String pass = in.next();
                Teacher(id, pass);
            }
        }
    }
}