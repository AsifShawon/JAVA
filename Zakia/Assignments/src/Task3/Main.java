package Task3;

public class Main {
    public static void main(String[] args) {
        RegularPolygon Obj1 = new RegularPolygon();
        RegularPolygon Obj2 = new RegularPolygon(10, 6);
        RegularPolygon Obj3 = new RegularPolygon(6, 4, 5.6, 7.8);

        System.out.println("Regular Polygon Object\t | Perimeter\t | Area");
        System.out.println("--------------------------------------------------");
        System.out.printf("\tObject# 1\t\t\t | %.2f\t\t\t | %.2f\n",Obj1.getPerimeter(),Obj1.getArea());
        System.out.printf("\tObject# 2\t\t\t | %.2f \t\t | %.2f\n",Obj2.getPerimeter(),Obj2.getArea());
        System.out.printf("\tObject# 3\t\t\t | %.2f \t\t | %.2f\n",Obj3.getPerimeter(),Obj3.getArea());
//        System.out.println("\tObject# 1\t\t\t | \t"+Obj1.getPerimeter()+"\t\t | "+Obj1.getArea());
//        System.out.println("\tObject# 1\t\t\t | \t"+Obj2.getPerimeter()+"\t\t | "+Obj2.getArea());
//        System.out.println("\tObject# 1\t\t\t | \t"+Obj3.getPerimeter()+"\t\t | "+Obj3.getArea());
    }
}
