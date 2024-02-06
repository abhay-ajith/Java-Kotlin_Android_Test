package Java_Lamda;

public class Q2 {
    public static void main(String[] args) {
        // Lambda expression to check if a string is empty
        StringCheckFunction stringCheckFunction = s -> s.isEmpty();

        // Test the lambda expression
        String str = "";
        boolean isEmpty = stringCheckFunction.check(str);
        System.out.println("Is the string empty? " + isEmpty);
    }
}

interface StringCheckFunction {
    boolean check(String s);
}
