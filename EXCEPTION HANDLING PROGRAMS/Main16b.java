public class Main16b {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30};

        try {
            int result = nums[3] / 0;  // Index error + divide by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes.");
        }
    }
}
