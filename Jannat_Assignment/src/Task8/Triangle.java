package Task8;

public class Triangle {
    private Line sideA;
    private Line sideB;
    private Line sideC;

    public Triangle(Line sideA, Line sideB, Line sideC) {
        if (isValidTriangle(sideA, sideB, sideC)) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            System.out.println("Error: Invalid triangle sides provided.");
        }
    }

    private boolean isValidTriangle(Line sideA, Line sideB, Line sideC) {
        double a = sideA.getLength();
        double b = sideB.getLength();
        double c = sideC.getLength();
        return a + b > c && a + c > b && b + c > a;
    }

    public Line getSideA() {
        return sideA;
    }

    public Line getSideB() {
        return sideB;
    }

    public Line getSideC() {
        return sideC;
    }

    public void setSideA(Line sideA) {
        this.sideA = sideA;
    }

    public void setSideB(Line sideB) {
        this.sideB = sideB;
    }

    public void setSideC(Line sideC) {
        this.sideC = sideC;
    }

    public double perimeter() {
        return sideA.getLength() + sideB.getLength() + sideC.getLength();
    }

    public double area() {
        double s = perimeter() / 2;
        double a = sideA.getLength();
        double b = sideB.getLength();
        double c = sideC.getLength();
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
