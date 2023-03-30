public class Drib {
    private int numerator;
    private int denominator;

    public Drib(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public Drib add(Drib other) {
        int numerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int denominator = this.denominator * other.denominator;
        return new Drib(numerator,denominator);
    }

    public Drib subtract(Drib other) {
        int numerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int denominator = this.denominator * other.denominator;
        return new Drib(numerator,denominator);
    }

    public Drib multiply(Drib other) {
        int numerator = this.numerator * other.numerator;
        int denominator = this.denominator * other.denominator;
        return new Drib(numerator,denominator);
    }

    public Drib divide(Drib other) {
        int numerator = this.numerator * other.denominator;
        int denominator = this.denominator * other.numerator;
        return new Drib(numerator,denominator);
    }

    private void simplify() {
        int gcd = greatestCommonDivisor(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    private int greatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return greatestCommonDivisor(b, a % b);
        }
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        Drib d1 = new Drib(1, 2);
        Drib d2 = new Drib(3, 4);

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

        d1.add(d2);
        System.out.println("d1 + d2 = " + d1);

        d1.subtract(d2);
        System.out.println("d1 - d2 = " + d1);

        d1.multiply(d2);
        System.out.println("d1 * d2 = " + d1);

        d1.divide(d2);
        System.out.println("d1 / d2 = " + d1);
    }
}
