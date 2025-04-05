interface Drawable {
    void draw();
}

abstract class Polygon {
    int sides;

    Polygon(int sides) {
        this.sides = sides;
    }

    abstract int getInteriorAngleSum();
}

class Triangle extends Polygon implements Drawable {
    Triangle() {
        super(3);
    }

    int getInteriorAngleSum() {
        return 180;
    }

    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

public class Main13c {
    public static void main(String[] args) {
        Polygon poly = new Triangle();
        System.out.println("Sides: " + poly.sides);
        System.out.println("Interior Angle Sum: " + poly.getInteriorAngleSum());

        Drawable d = (Drawable) poly;
        d.draw();
    }
}
