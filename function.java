public class function {

    public static void shyam() {
        System.err.println("Hello, sam!");
    }

    // Method to add two numbers and print the result
    public static void sum(int a, int b) {
        int result = add(a, b);
        System.out.println("Sum: " + result);
    }

    // Method to return the sum of two numbers
    public static int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        shyam();
        shyam();
        shyam();
        sum(4, 5);
        sum(6, 7);
    }
}