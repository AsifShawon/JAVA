package lab_tasks.prac1;

public class Main {
    public static void main(String[] args)  {
        EBook b1 = new EBook("Aj Himur Biye","Humayun Ahmed",155.50,"pdfhub.com/ajHimurBiye",23.4f);
        PaperBook b2 = new PaperBook("Aj Himur Biye","Humayun Ahmed",155.50,170,true);
        System.out.println("Ebook\n>> "+b1);
        System.out.println("Paper Book\n>> "+b2);
    }
}
