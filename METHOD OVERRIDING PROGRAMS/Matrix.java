class Matrix {
    int[][] matrix;

    Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    // Method for matrix multiplication with another matrix
    Matrix multiply(Matrix m) {
        int rows = this.matrix.length;
        int cols = m.matrix[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < this.matrix[0].length; k++) {
                    result[i][j] += this.matrix[i][k] * m.matrix[k][j];
                }
            }
        }
        return new Matrix(result);
    }

    // Method to display the matrix
    void display() {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat1 = {{1, 2}, {3, 4}};
        int[][] mat2 = {{5, 6}, {7, 8}};
        
        Matrix m1 = new Matrix(mat1);
        Matrix m2 = new Matrix(mat2);
        
        Matrix result = m1.multiply(m2);
        
        System.out.println("Matrix 1:");
        m1.display();
        System.out.println("Matrix 2:");
        m2.display();
        System.out.println("Result of Multiplication:");
        result.display();
    }
}
