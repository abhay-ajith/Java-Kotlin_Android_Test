package Java_Regex;

public class Q2 {
    public static void main(String[] args) {
        String input = "Hello! How are you? 1234!@#$%";
        String result = removeNonAlphanumeric(input);
        System.out.println("Result: " + result);
    }

    public static String removeNonAlphanumeric(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "");
    }
}
