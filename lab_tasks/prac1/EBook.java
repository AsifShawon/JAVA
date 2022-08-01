package lab_tasks.prac1;

public class EBook extends Book {
    String downloadUrl;
    float size;
    EBook(String title, String author, double price,String downloadUrl, float size){
        super(title,author,price);
        this.downloadUrl = downloadUrl;
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + downloadUrl + " | " + size+ "MB";
    }
}
