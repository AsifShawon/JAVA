package lab16;

public class Quiz {
    private int id;
    private int marks;

    public Quiz(int id, int marks) {
        this.id = id;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "ID:" + id + "\nmark:" + marks;
    }
}
