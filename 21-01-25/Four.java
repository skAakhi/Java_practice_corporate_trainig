public class Four {
    public static void main(String[] args) {
        try {
            System.out.println("Try block starts");
            int result = 10 / 0; // This will throw ArithmeticException
            System.out.println("Result: " + result); // This line won't execute
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executes");
        }
        System.out.println("Code after try-finally");
    }
}
