



import java.util.Scanner;

public class RotateArray {

    public static void main (String [] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Arrays");

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();

        }

        int d = sc.nextInt();


int n= arr.length;
        d = d % n ;

        rotate(arr, 0 ,   d-1 );
        rotate(arr , d , n-1  );
        rotate(arr , 0 , n-1);



        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }



    }


    static void  rotate(int [] arr , int l , int r){

        while (l < r) {
            int temp = arr[l];

            arr[l] = arr [r];

            arr[r] = temp ;

            l++;
            r--;

        }



    }


}