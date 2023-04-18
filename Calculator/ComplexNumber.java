
class ComplexNumber {
    private double real, imag;
    
    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(real + other.real, imag + other.imag);
    }
    
    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(real - other.real, imag - other.imag);
    }
    
    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = real * other.real - imag * other.imag;
        double newImag = real * other.imag + imag * other.real;
        return new ComplexNumber(newReal, newImag);
    }
    
    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imag * other.imag;
        if (denominator == 0) {
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        double newReal = (real * other.real + imag * other.imag) / denominator;
        double newImag = (imag * other.real - real * other.imag) / denominator;
        return new ComplexNumber(newReal, newImag);
    }

    @Override
    public String toString() {
        if (imag == 0) {
            return String.format("%.2f", real); // если мнимая часть равна нулю
        } else if (real == 0) {
            return String.format("%.2fi", imag); // если вещественная часть равна нулю
        } else {
            return String.format("%.2f + %.2fi", real, imag);
        }
    }
}