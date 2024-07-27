package Task9;

public class Disk extends Circle {
    private double innerRadius;

    public Disk(double radius, double innerRadius, String fillColor, String strokeColor, double strokeThickness) {
        super(radius, fillColor, strokeColor, strokeThickness);
        this.innerRadius = innerRadius;
    }

    public double getInnerRadius() {
        return innerRadius;
    }

    public void setInnerRadius(double innerRadius) {
        this.innerRadius = innerRadius;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "innerRadius=" + innerRadius +
                "} " + super.toString();
    }

    public double area() {
        return super.area() - (Math.PI * innerRadius * innerRadius);
    }
}

