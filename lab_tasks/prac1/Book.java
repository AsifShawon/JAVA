package lab_tasks.prac1;

public class Book {
    String title, author;
    double price;

    Book(String title, String author, double price){
        this.author = author;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return title + " | " + author + " | " + price;
    }
}
