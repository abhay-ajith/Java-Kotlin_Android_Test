package Java_Lamda;

public class Q1 {
    public static void main(String[] args) {
        // Lambda expression to find the sum of two integers
        SumFunction sumFunction = (a, b) -> a + b;

        // Test the lambda expression
        int result = sumFunction.sum(5, 3);
        System.out.println("Sum of 5 and 3: " + result);
    }
}

interface SumFunction {
    int sum(int a, int b);
}
