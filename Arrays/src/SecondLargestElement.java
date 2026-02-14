import java.util.Scanner;

public class SecondLargestElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array elements:");
        int[] arr = new int[5];

        // 🔹 Array input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int result = secondlargest(arr);

        if (result == Integer.MIN_VALUE) {
            System.out.println("Second largest element does not exist");
        } else {
            System.out.println("Second largest element is: " + result);
        }
    }

    static int secondlargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondlargest && arr[i] < largest) {
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
}
