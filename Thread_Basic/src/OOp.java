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
        Constructon contract2  = new Constructon();
        contract1.sement = 100;
        contract1.steel = 200;
        contract1.wire = 30;

        contract2.sement = 110;
        contract2.steel = 220;
        contract2.wire = 40;
        contract1.print_contruct();
        System.out.println("");
        contract2.print_contruct();
    }
}