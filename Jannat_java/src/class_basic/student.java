package class_basic;

public class student {
    private String name;
    private int id,totalStudent;

    // constructor - special method, named as "ClassName" and no return type
    public student(String name, int id, int totalStudent){
        this.name = name;
        this.id = id;
        this.totalStudent = totalStudent;
    }

    public int getID(){

        return id;

    }
}