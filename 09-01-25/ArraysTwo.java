import java.util.*;

 class SL{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element (all elements might be the same).");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}
