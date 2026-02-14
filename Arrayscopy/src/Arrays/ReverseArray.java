package Arrays;

import java.util.Scanner;

public class ReverseArray {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Array");

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        reverse(arr);

        for (int i = 0 ; i <arr.length; i++) {
            System.out.println(arr[i] );

        }
    }

    static void reverse(int []arr ) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];

            arr[left] = arr[right];

            arr[right] = temp;

            left++;
            right--;
        }




    }
}
