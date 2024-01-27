ic class Q1 {
    public static void main(String[] args) {
        
        // Get array size from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Create an array with the specified size
        int[] array = new int[size];

        // Get array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        // Calling to calc sum and average
        int sum = calcSum(array);
        double average = clacAvg(array);

        // Display results
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

    }

    //To calculate the sum of array elements
    private static int calcSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // To calculate the average of array elements
    private static double clacAvg(int[] array) {
        int sum = calcSum(array);
        return (double) sum / array.length;
    }
    
}
