package Java_Regex;

public class Q3 {
    public static void main(String[] args) {
        String phoneNumber = "123-456-7890";
        boolean isValid = validatePhoneNumber(phoneNumber);
        System.out.println("Is the phone number valid? " + isValid);
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        // Regular expression to match a phone number in the format xxx-xxx-xxxx
        String regex = "\\d{3}-\\d{3}-\\d{4}";
        return phoneNumber.matches(regex);
    }
}
