import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();

        String line;
        int a = sc.nextInt();
        String s[];
        int space;
        while(a!=0){
            space = 0;
            System.out.println("Line: ");
            line = sc1.nextLine();
            Scanner in = new Scanner(line);

            while(in.hasNext()){
                lines.add(in.next());
            }
            int i=0,j=0, count=0, trac= -1;
//            System.out.println(lines.size());
            while(i!=lines.size()-1){
                if(lines.get(i).equalsIgnoreCase(lines.get(j))){
                    count++;
                    if(count==2){
                        lines.remove(j);
                        j=-1;count=1;
                    }
                }j++;
                if(j==lines.size()-1) {i++;j=i;count=0;}
            }

            i=0;
            while(i!=lines.size()) { System.out.print(lines.get(i)+" "); i++;}

            System.out.println("");
            --a;
        }
    }
}