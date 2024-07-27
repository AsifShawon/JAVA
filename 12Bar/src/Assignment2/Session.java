package Assignment2;

import java.util.*;

public class Session {
    private static Session session = null;
    private User userList[] = new User[7];
    private Course courseList[] = new Course[6];
    public Scanner inputScanner = new Scanner(System.in);


    private Session()
    {
        createDatabase();
    }

    private static void createDatabase()
    {
        //getSession();

        //for USer 1(Student)
        session.userList[0].setEmail("student_a@northsouth.edu");
        session.userList[0].setPassword("password");
        session.userList[0].setId("S1");
        session.userList[0].setName("A");
        session.userList[0].setCGPA(3.4);
        //session.userList[0].setCourses();

        //for User 2(Student)
        session.userList[1].setEmail("student_b@northsouth.edu");
        session.userList[1].setPassword("password");
        session.userList[1].setId("S2");
        session.userList[1].setName("B");
        session.userList[1].setCGPA(3.6);

        //for User 3(Student)
        session.userList[2].setEmail("student_c@northsouth.edu");
        session.userList[2].setPassword("password");
        session.userList[2].setId("S3");
        session.userList[2].setName("B");
        session.userList[2].setCGPA(3.2);

        //for User 4(Teacher)
        session.userList[3].setEmail("teacher_a@northsouth.edu");
        session.userList[3].setPassword("password");
        session.userList[3].setId("T1");
        session.userList[3].setName("A");

        //for User 5(Teacher)
        session.userList[4].setEmail("teacher_b@northsouth.edu");
        session.userList[4].setPassword("password");
        session.userList[4].setId("T2");
        session.userList[4].setName("B");

        //for User 6(TA)
        session.userList[5].setEmail("ta_a@northsouth.edu");
        session.userList[5].setPassword("password");
        session.userList[5].setId("A1");
        session.userList[5].setName("A");


        //for User 7(TA)
        session.userList[6].setEmail("ta_b@northsouth.edu");
        session.userList[6].setPassword("password");
        session.userList[6].setId("A2");
        session.userList[6].setName("B");



        //for Course A 1
        session.courseList[0].setCourseName("Course A") ;
        session.courseList[0].setSection("1");
        session.courseList[0].setTime("A");
        session.courseList[0].setTeacher("T1");
        session.courseList[0].setTa("A");

        //for course A 2
        session.courseList[1].setCourseName("Course A");
        session.courseList[1].setSection("2");
        session.courseList[1].setTime("A");
        session.courseList[1].setTeacher("T2");
        session.courseList[1].setTa("A");



        //for Course A 3
        session.courseList[2].setCourseName("Course A");
        session.courseList[2].setSection("3");
        session.courseList[2].setTime("B");
        session.courseList[2].setTeacher("T1");
        session.courseList[2].setTa("B");

        //for Course B 1
        session.courseList[3].setCourseName("Course B");
        session.courseList[3].setSection("1");
        session.courseList[3].setTime("A");
        session.courseList[3].setTeacher("T1");
        session.courseList[3].setTa("A");

        //for Course C 1
        session.courseList[4].setCourseName("Course C");
        session.courseList[4].setSection("1");
        session.courseList[4].setTime("B");
        session.courseList[4].setTeacher("T2");
        session.courseList[4].setTa("A");

        //for Course C 2
        session.courseList[5].setCourseName("Course C");
        session.courseList[5].setSection("2");
        session.courseList[5].setTime("C");
        session.courseList[5].setTeacher("T1");
        session.courseList[5].setTa("B");


    }


    public static Session getSession()
    {
        if (session == null)
        {
            session = new Session();
        }
        return session;
    }

    public Course[] getCourseList()
    {
        return courseList;
    }

    public User[] getUserList()
    {
        return userList;
    }

}
