package Arrays;

public class MaxSumSubArray {

    public static void main(String [] args){


        int [] arr = {2, 3, -8, 7, -1, 2, 3};

        System.out.println(maximum(arr));



    }

    public static  int  maximum(int [] arr){

        int currentsum = arr[0];
        int maxsum = arr[0];

        for (int i = 1; i <= arr.length-1; i++){


            currentsum = Math.max(arr[i] ,  currentsum + arr[i]);

            maxsum = Math.max(maxsum , currentsum);

        }
        return maxsum;
    }




}




