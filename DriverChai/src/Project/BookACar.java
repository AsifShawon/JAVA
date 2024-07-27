package Project;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookACar {
    Scanner sc = new Scanner(System.in);
    Scanner str_sc = new Scanner(System.in);
    static String[] place = {"Jatrabari","Kamalapur","Motijheel","Agargaon","Badda","Hatijheel",
            "Natunbajar","Gulshan","Banani","Bashundara","Dhanmondi","Uttara"};

    public BookACar() {
        //
    }

    public BookACar(String name, int place_no, String details) {
        BookACarDetails bcd = new BookACarDetails(name, place_no, details);

        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("BookAcar.dat", true))) {
            outputStream.writeUTF(bcd.getName());
            outputStream.writeInt(bcd.getPlace_no());
            outputStream.writeUTF(bcd.getDetails());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String[] getPlace() {
        return place;
    }

    public static void setPlace(String[] place) {
        BookACar.place = place;
    }

    public List<BookACarDetails> getBookings() {
        List<BookACarDetails> bcds = new ArrayList<>();
        try (DataInputStream inputStream = new DataInputStream(new FileInputStream("BookAcar.dat"))) {
            String name, details;
            int place_no;
            while (true) {
                name = inputStream.readUTF();
                place_no = inputStream.readInt();
                details = inputStream.readUTF();
                BookACarDetails bcd = new BookACarDetails(name, place_no, details);
                bcds.add(bcd);
            }
        } catch (EOFException e) {
            // Reached end of file
        } catch (Exception e) {
            System.out.println("No record found :(");
        }
        return bcds;
    }

    public void updateBookings(String name, int placeNo, String details) {
        List<BookACarDetails> bookings = getBookings();
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("BookAcar.dat"))) {
            for (BookACarDetails booking : bookings) {
                if (!(booking.getName().equals(name) && booking.getPlace_no() == placeNo && booking.getDetails().equals(details))) {
                    outputStream.writeUTF(booking.getName());
                    outputStream.writeInt(booking.getPlace_no());
                    outputStream.writeUTF(booking.getDetails());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
