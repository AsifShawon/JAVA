package MorePractice;

public class BookMain {
    public static void main(String[] args) {
        Author a1 = new Author("Humayun Ahmed","himu@humayun.com",'m');
        //System.out.println(a1);
        Book b1 = new Book("Aj Himur Biye",a1,150.00,5);
        System.out.println(b1);
    }
}
