abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class TestShapes {
    public static void main(String[] args) {
        Shape circle = new Circle(7); // Circle with radius 7
        Shape triangle = new Triangle(10, 5); // Triangle with base 10 and height 5
        
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
