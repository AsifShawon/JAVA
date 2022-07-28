package lab_tasks.no9;

public class Person {
    private String name,gender;
    private int age;
    Person(){}
    Person(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getGender() {
        return this.gender;
    }
    public void printInfo() {
        System.out.println(name+" "+gender+" "+age);
    }
    public String toString() {
        return name+" "+gender+" "+age+" ";
    }
}
