public class exercise 2 {
    // MethodOverloadingExample
    // Method to display an integer
    public static void display(int number) {
        System.out.println("The number is: " + number);
    }

    // Overloaded method to display a string
    public static void display(String text) {
        System.out.println("The text is: " + text);
    }

    public static void main(String[] args) {
        // Call the overloaded methods
        display(23); // Output: The number is: 23
        display("Shamsa"); // Output: The text is: Shamsa
    }
}
