import java.util.ArrayList;

public class SpirallyTraversing {

    public static  void main (String[]args){

        int [][]arr = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};

         ArrayList<Integer> result =  spiraltraverse(arr);

        System.out.println(result);

    }

   static  ArrayList<Integer>  spiraltraverse(int [][]arr){


        ArrayList<Integer> res= new ArrayList<>();

        int n = arr.length;;
        int m = arr[0].length;



        int top = 0 ;
        int bottom = n-1 ;


        int left = 0 ;
        int right = m-1  ;


        while (top <= bottom && left <= right){

            for (int i = left; i <= right; i++){

                res.add(arr[top][i]);
            }

top++;

            for (int i = top; i <= bottom ; i ++){

                res.add(arr[i][right]);
            }

            right--;


        if(top <= bottom) {

            for (int i = right; i >= left; i--) {

                res.add(arr[bottom][i]);
            }
            bottom--;
        }

        if (left<= right){

            for (int i = bottom; i>= top; i--){
                res.add(arr[i][left]);
            }

            left++;
        }








   }
        return res;

}}
