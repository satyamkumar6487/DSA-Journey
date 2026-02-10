import java.util.Arrays;

public class MinimizeHeight {

    public static void main (String []args){

//        int [] arr = {1,5,8,10};
//        int k =2 ;
        int [] arr = {3, 9, 12, 16, 20};
        int k =3 ;



        System.out.println(minmizeheight(arr, k));


    }
    static  int minmizeheight(int [] arr , int k){

        int n= arr.length;

        if (n == 1)
            return 0;

        Arrays.sort(arr);

        int ans = arr[n-1] -  arr[0];

        int small = arr[0] + k;

        int large = arr[n-1] -k;

        if (small > large) {
            int temp = small;
            small = large;
            large = temp;
        }



        for (int i = 1 ; i< n-1 ; i ++ ){

            int subtract = arr[i] - k;
            int add = arr[i] + k ;
            if (subtract < 0)
                continue;

            int newMin = Math.min(small , subtract);
            int newMax = Math.max(large , add);


            ans  = Math.min(ans , newMax - newMin);

        }
        return ans;

    }



}
