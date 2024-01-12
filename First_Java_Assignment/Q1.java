// 1	Write a Java program to print the sum of two numbers, subtraction, multiplication, division. (normal way)

package First_Java_Assignment;

public class Q1 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 3;

        // Printing the calculated values
        System.out.println("Sum : " + (num1 + num2));
        System.out.println("Subtraction : " + (num1 - num2));
        System.out.println("Multiplication : " + (num1 * num2));

        // Checking the 0 condition for division
        if (num2 != 0) {
            System.out.println("Division : " + (num1 / num2));
        } else {
            System.out.println("Division cannot be performed");
        }

    }

}