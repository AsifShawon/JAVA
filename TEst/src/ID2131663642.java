
import java.util.Scanner;

class InvalidMailException extends Exception{
    private String mail;
    public InvalidMailException(String mail){
        this.mail = mail;
    }
    public String toString(){
        return "InvalidMailException: \"" + mail +"\"\nShould be end with \"@gamil.com\" or \"@northsouth.edu\"";
    }
}


public class ID2131663642 {
    static void checkMail(String mail) throws InvalidMailException{
        if(mail.endsWith("@gmail.com") || mail.endsWith("@northsouth.edu")){
            System.out.printf("Yes!! Your mail is valid.");
        }
        else throw new InvalidMailException(mail);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your maiL: ");
        String mail = sc.next();

        try {
            checkMail(mail);
        }
        catch (Exception e){
            System.out.printf("Exception Caught: "+e);
        }
    }
}
