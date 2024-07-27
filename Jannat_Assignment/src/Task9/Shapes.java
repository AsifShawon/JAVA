package Task9;

public class Shapes {
    private String fillColor;
    private String strokeColor;
    private double strokeThickness;

    // Constructor
    public Shapes(String fillColor, String strokeColor, double strokeThickness) {
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
        this.strokeThickness = strokeThickness;
    }

    // Getters
    public String getFillColor() {
        return fillColor;
    }

    public String getStrokeColor() {
        return strokeColor;
    }

    public double getStrokeThickness() {
        return strokeThickness;
    }

    // Setters
    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public void setStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
    }

    public void setStrokeThickness(double strokeThickness) {
        this.strokeThickness = strokeThickness;
    }

    // toString method
    @Override
    public String toString() {
        return "Shapes{" +
                "fillColor='" + fillColor + '\'' +
                ", strokeColor='" + strokeColor + '\'' +
                ", strokeThickness=" + strokeThickness +
                '}';
    }
}

