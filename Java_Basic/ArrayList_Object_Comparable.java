package Generics;

import java.util.ArrayList;
import java.util.Collections;

// a simple class implementing comparable interface
class Student implements Comparable<Student> {
    String name;
    int id; double cgpa;
    public Student(String name,int id, double cgpa){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public String toString(){
        return name+" "+id+" "+cgpa;
    }

    // sorts by id (up to down)
    @Override
    public int compareTo(Student o) {
        if(id==o.id) return 0;
        if(id<o.id)return -1;
        else return 1;
    }

    // sorts by name (Lexicographically)
    /*  @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }   */
}

public class ArrayList_Object_Comparable {
    public static void main(String[] args) {
        ArrayList<Student> stuList = new ArrayList<>();
        Student s1 = new Student("Shawon",1,3.33);
        Student s2 = new Student("Shafkat",2,3.86);
        Student s3 = new Student("Tousif",3,3.90);

        stuList.add(s2);stuList.add(s1);stuList.add(s3);
        /* for(Student s:stuList)
            System.out.println(s); */

        System.out.println(stuList);
        stuList.add(2,new Student("Rafi",4,3.99));
        System.out.println(stuList);
        Collections.sort(stuList);
//        System.out.println(stuList);
        System.out.println("\nSorted by id: ");
        for(Student s:stuList)
            System.out.println(s);
    }
}
