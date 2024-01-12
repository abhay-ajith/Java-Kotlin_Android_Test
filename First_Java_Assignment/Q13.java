// 13	Write a Java program to display system time.

package First_Java_Assignment;

import java.time.LocalTime;

public class Q13 {
    public static void main(String[] args) {
        // Getting Local time from LocalTime class
        LocalTime lt = LocalTime.now();

        // Output
        System.out.println("Current System TIme: " + lt);
    }
}
