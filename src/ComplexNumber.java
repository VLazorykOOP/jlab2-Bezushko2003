public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getModulus() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double getArgument() {
        return Math.atan2(imaginary, real);
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(real + other.real, imaginary + other.imaginary);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(real - other.real, imaginary - other.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = real * other.real - imaginary * other.imaginary;
        double newImaginary = real * other.imaginary + imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double newReal = (real * other.real + imaginary * other.imaginary) / denominator;
        double newImaginary = (imaginary * other.real - real * other.imaginary) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber conjugate() {
        return new ComplexNumber(real, -imaginary);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + (-imaginary) + "i";
        }
    }

    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(1, 2);
        ComplexNumber z2 = new ComplexNumber(3, 4);

        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);

        double modulus1 = z1.getModulus();
        double modulus2 = z2.getModulus();
        System.out.println("|z1| = " + modulus1);
        System.out.println("|z2| = " + modulus2);

        double argument1 = z1.getArgument();
        double argument2 = z2.getArgument();
        System.out.println("arg(z1) = " + argument1);
        System.out.println("arg(z2) = " + argument2);

        ComplexNumber sum = z1.add(z2);
        System.out.println("z1 + z2 = " + sum);

        ComplexNumber diff = z1.subtract(z2);
        System.out.println("z1 - z2 = " + diff);

        ComplexNumber product = z1.multiply(z2);
        System.out.println("z1 * z2 = " + product);

        ComplexNumber quotient = z1.divide(z2);
        System.out.println("z1 / z2 = " + quotient);

        ComplexNumber conjugate1 = z1.conjugate();
        ComplexNumber conjugate2 = z2.conjugate();
        System.out.println("conj(z1) = " + conjugate1);
        System.out.println("conj(z2) = " + conjugate2);
    }
}
