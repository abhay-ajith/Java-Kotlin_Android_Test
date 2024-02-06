package Java_Exception_Handling;

public class Q1 {
    public static void main(String[] args) {
        try {
            checkIfEven(5);
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkIfEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("Number is odd!");
        } else {
            System.out.println("Number is even.");
        }
    }
}

class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}
