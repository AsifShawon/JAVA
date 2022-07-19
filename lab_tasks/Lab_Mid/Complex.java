package Lab_Mid;

public class Complex {
    private double real, imaginary;
    public Complex(){}
    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
    public double getReal() {
        return real;
    }
    public double getImaginary() {
        return imaginary;
    }

    public Complex add(Complex cmp){
        Complex c = new Complex();
        c.real = this.real+cmp.real;
        c.imaginary = this.imaginary+cmp.imaginary;
        return c;
    }
    public Complex subtract(Complex cmp){
        Complex c = new Complex();
        c.real = this.real-cmp.real;
        c.imaginary = this.imaginary-cmp.imaginary;
        return c;
    }
    public Complex multiplication(Complex cmp){
        Complex c = new Complex();
        c.real = this.real*cmp.real - this.imaginary*cmp.imaginary;
        c.imaginary = this.real*cmp.imaginary + this.imaginary*cmp.real;
        return c;
    }
    public Complex divide(Complex cmp){
        Complex c = new Complex();
        c.real = (this.real*cmp.real+this.imaginary*cmp.imaginary)/(cmp.real*cmp.real + cmp.imaginary*cmp.imaginary);
        c.imaginary = (this.imaginary*cmp.real-this.real*cmp.imaginary)/ (cmp.real*cmp.real + cmp.imaginary*cmp.imaginary);
        return c;
    }
    public String toString(){
        return real+" + ("+imaginary+")i";
    }
}
