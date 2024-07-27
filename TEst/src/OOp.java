class Constructon{
   // atrivutes
   double sement, steel, wire;

   void print_contruct(){
    System.out.println("Sement: "+sement+" kg");
    System.out.println("Steel: "+steel+" kg");
    System.out.println("Wire: "+wire+" kg");
   }
}

public class OOp{
    public static void main(String[] args) {
        Constructon contract1  = new Constructon(); 
        contract1.sement = 100;
        contract1.steel = 200;
        contract1.wire = 30;
        contract1.print_contruct();
    }
}