package Tps.Tp3.Ej6;

public class ComplexNumber {

    private double real;
    private double imaginary = 0;

    public ComplexNumber(double real, double imaginary) {

        this.real = real;
        this.imaginary = imaginary;

    }

    public ComplexNumber(double real) {

        this.real = real;

    }

    @Override
    public boolean equals(Object obj) {

        if (this instanceof Object){
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        ComplexNumber that = (ComplexNumber) obj;
        return Double.compare(that.real, real) == 0 && Double.compare(that.imaginary, imaginary) == 0;
    }

    public double getReal(ComplexNumber c) {
        return c.real;
    }
    public double getImaginary(ComplexNumber c) {
        return c.imaginary;
    }

    public ComplexNumber plus(ComplexNumber c2){
        return new ComplexNumber(this.real + c2.real, this.imaginary + c2.imaginary);
    }

    public ComplexNumber plus(double n1){
        return new ComplexNumber(this.real + n1, this.imaginary);
    }
    @Override
    public String toString() {
        return "%f + %f".formatted(this.real, this.imaginary);
    }
}
