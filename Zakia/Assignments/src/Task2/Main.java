package Task2;

public class Main {
    public static void main(String[] args) {
        MyString1 nsu_id = new MyString1("2131663642"); // চেঞ্জ করিস
        System.out.println("Length of the string is: "+nsu_id.length());
        System.out.println("Number at the 8th digit is: "+nsu_id.charAt(8));
        MyString1 test = new MyString1("Test123");
        System.out.println("Is there any string equal to 'Test123': "+nsu_id.equals(test));
        System.out.println("Last 3 digit of the my NSU ID is: "+nsu_id.substring(7,10));
        System.out.println("Uppercase of my string is: "+nsu_id.toUpperCase());
        System.out.print("8th digit of my NSU ID is "+nsu_id.charAt(8));
        if(nsu_id.charAt(8)=='6'){
            System.out.println(". I have to make it 0 before graduating from NSU.");
        }
        else {
            System.out.println(". 8th digit is already 0.");
        }
    }
}
