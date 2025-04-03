class Cylinder {
    double radius, height;
    String material;

    // Constructor for 2D representation (circular base)
    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        this.material = "Unknown";  // Default value for 2D representation
        System.out.println("Cylinder with 2D base created: Radius = " + radius + ", Height = " + height);
    }

    // Constructor for 3D cylinder with material type
    Cylinder(double radius, double height, String material) {
        this.radius = radius;
        this.height = height;
        this.material = material;
        System.out.println("3D Cylinder created: Radius = " + radius + ", Height = " + height + ", Material = " + material);
    }

    // Method to calculate the surface area of the cylinder
    double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public static void main(String[] args) {
        // 2D Cylinder (like a circle)
        Cylinder cylinder2D = new Cylinder(5, 10);
        System.out.println("Surface Area of 2D Cylinder: " + cylinder2D.surfaceArea());

        // 3D Cylinder (with material)
        Cylinder cylinder3D = new Cylinder(5, 10, "Steel");
        System.out.println("Surface Area of 3D Cylinder: " + cylinder3D.surfaceArea());
    }
}
