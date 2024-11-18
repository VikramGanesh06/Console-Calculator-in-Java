import java.util.Scanner;

class Main {
    public static void sum(int var1, int var2) {
        System.out.println("Addition: " + (var1 + var2));
        System.out.println("Subtraction: " + (var1 - var2));
        System.out.println("Division: " + (var1 / var2));
        System.out.println("Multiplication: " + (var1 * var2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        sum(num1, num2);
    }
}
