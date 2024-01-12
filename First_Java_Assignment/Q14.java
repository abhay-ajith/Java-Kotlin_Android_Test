// 14	Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.

package First_Java_Assignment;

public class Q14 {
    public static void main(String[] args) {

        // Calling the functions
        divideByThree();
        System.out.println();
        divideByFive();
        System.out.println();
        divideByThreeandFive();
    }

    private static void divideByThree() {
        // Gets the values divisible by three
        for (int i = 2; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Divsible by 3 " + i);
            }
        }
    }

    private static void divideByFive() {
        // Gets the values divisible by Five
        for (int i = 2; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.println("Divsible by 5 " + i);
            }
        }
    }

    private static void divideByThreeandFive() {
        // Gets the values divisible by 3 & 5
        for (int i = 2; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Divsible by 3&5 " + i);
            }
        }
    }

}
