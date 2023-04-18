

class RationalNumber {
    private int numerator, denominator;

    public RationalNumber(int num, int den) {
        numerator = num;
        denominator = den;
    }

    public RationalNumber add(RationalNumber r) {
        int num = numerator * r.denominator + denominator * r.numerator;
        int den = denominator * r.denominator;
        return new RationalNumber(num, den);
    }

    public RationalNumber subtract(RationalNumber r) {
        int num = numerator * r.denominator - denominator * r.numerator;
        int den = denominator * r.denominator;
        return new RationalNumber(num, den);
    }

    public RationalNumber multiply(RationalNumber r) {
        int num = numerator * r.numerator;
        int den = denominator * r.denominator;
        return new RationalNumber(num, den);
    }

    public RationalNumber divide(RationalNumber r) {
        int num = numerator * r.denominator;
        int den = denominator * r.numerator;
        return new RationalNumber(num, den);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}
