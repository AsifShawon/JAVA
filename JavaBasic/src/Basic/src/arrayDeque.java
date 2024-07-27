import java.util.ArrayDeque;
public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> a = new ArrayDeque<>();

        a.add(5);
        a.add(65);
        a.add(75);
        a.add(85);
        a.add(55); // adds in last
        a.addLast(45);
        a.addFirst(23);
        System.out.println(a);
        System.out.println(a.getFirst());
        System.out.println(a.getLast());
        a.removeFirst();
        System.out.println(a);
        a.remove(); // removes from first
        System.out.println(a);
        a.removeLast();
        System.out.println(a);
    }
}
