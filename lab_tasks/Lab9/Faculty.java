package lab_tasks.no9;

public class Faculty extends Employee{
    private String initial,rank;
    Faculty(){
        super();
    }
    Faculty(String name,int age,String gender, String id, String department, double salary,String initial, String rank){
        super(name,age,gender,id,department,salary);
        this.initial = initial;
        this.rank = rank;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    public String getInitial() {
        return this.initial;
    }
    public String getRank() {
        return this.rank ;
    }

    public String toString() {
        return super.toString()+initial+" "+rank;
    }

    public void printInfo() {
        System.out.print(initial+" "+rank);
    }

}
