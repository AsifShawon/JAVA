import java.io.File;
import java.io.FileWriter;
// nested try catch
public class Nested_Try_Catch {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i=1; i<10; i++){
            arr[i] = i+i;
        }

        try{
            FileWriter f = new FileWriter(new File("newFile1.txt"));
            try{
                int i=0;
                while(true){
                    f.write(arr[i]);
                    i++;
                }
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage()); // when the array index will be more than 9
            }
            f.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
