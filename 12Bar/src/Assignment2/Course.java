package Assignment2;


public class Course {
    private String courseName;
    private String section;
    private String time;
    private String teacher;
    private String ta;

    public Course()
    {

    }

    public Course(String courseName,String section, String time, String teacher, String ta)
    {
        this.courseName = courseName;
        this.section = section;
        this.time = time;
        this.teacher= teacher;
        this.ta = ta;
    }

    void addCourse()
    {
        Session session = Session.getSession();

    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getTa() {
        return ta;
    }

    public void setTa(String ta) {
        this.ta = ta;
    }



}
