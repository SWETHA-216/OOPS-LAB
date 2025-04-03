class Vector {
    double x, y, z;

    // Constructor for 2D vector
    Vector(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = 0;  // Default value for 2D vectors
        System.out.println("2D Vector Created: (" + x + ", " + y + ")");
    }

    // Constructor for 3D vector
    Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("3D Vector Created: (" + x + ", " + y + ", " + z + ")");
    }

    // Method to calculate magnitude of the vector
    double calculateMagnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public static void main(String[] args) {
        // Creating a 2D vector
        Vector v2D = new Vector(3, 4);
        System.out.println("Magnitude of 2D Vector: " + v2D.calculateMagnitude());

        // Creating a 3D vector
        Vector v3D = new Vector(1, 2, 3);
        System.out.println("Magnitude of 3D Vector: " + v3D.calculateMagnitude());
    }
}
