package Arrays;

import java.util.Scanner;

public class MoveZeroToEnd {
    public static void main (String []args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array");

        int  [] arr = new int[7];
        int j = 0;
        for (int i = 0 ; i < arr.length; i ++){

            arr[i] = sc.nextInt();


            if(arr[i] != 0){
                swap(arr , i , j);
                j++;

            }

        }

        System.out.println("Result");

        for (int x : arr){
            System.out.println(x + " ");

        }

    }

    private static void swap(int [] arr , int i , int j ){

        int temp = arr[i];
        arr[i] = arr[j];

        arr[j] = temp;

    }



}
