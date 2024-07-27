package Assignment2;


public class CourseManagement{

    static void viewCourse(Session s){
        s.getCourseList();
    }

    public static void main(String[] args) {

        while(true)
        {
            Session session = Session.getSession();
            
            System.out.println("Email: ");
            String email = session.inputScanner.nextLine();
            System.out.println("Password: ");
            String password = session.inputScanner.nextLine();
            User user = null;
            try
            {
                user = login(email,password);
            }
            catch(Exception ex)
            {
                getMessage();
                continue;
            }
            
            if(user.getEmail().startsWith("teacher")) {
            	Teacher teacher = new Teacher();
            	teacher.handleAction();
            }
            
            else if(user.getEmail().startsWith("student")) {
            	Student student = new Student();
            	student.handleAction();
            }
            
            else if(user.getEmail().startsWith("ta")) {
            	Ta ta = new Ta();
            	ta.handleAction();
            }
            else {
            	continue;
            }

        }


    }

    public static User login(String email, String password) throws Exception{
        Session session = Session.getSession();

        User[] list = new User[7];
        list = session.getUserList();
        for(int i=0 ; i<7; i++)
        {
            if(email==list[i].getEmail() && password==list[i].getPassword())
            {
                return list[i];
            }
        }
        throw new Exception("User not found");
        //for wrong credential: throw new Exception("User not found");
        //call getMessage() on the exception instance to get the error message
    }

    public static void getMessage()
    {
        System.out.println("User not found");
    }

}


