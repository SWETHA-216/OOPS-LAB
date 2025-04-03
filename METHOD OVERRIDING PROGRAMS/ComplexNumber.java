class ComplexNumber {
    double real, imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    ComplexNumber add(ComplexNumber c) {
        return new ComplexNumber(this.real + c.real, this.imaginary + c.imaginary);
    }

    // Method to subtract two complex numbers
    ComplexNumber subtract(ComplexNumber c) {
        return new ComplexNumber(this.real - c.real, this.imaginary - c.imaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 4);
        ComplexNumber c2 = new ComplexNumber(1, 2);

        System.out.println("Sum: " + c1.add(c2));
        System.out.println("Difference: " + c1.subtract(c2));
    }
}
