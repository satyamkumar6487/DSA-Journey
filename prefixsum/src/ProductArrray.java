public class ProductArrray {

    public static void main (String[]args){

        int []arr = {10, 3, 5, 6, 2};

       int []result = productExceptSelf(arr);

       for (int num : result){
           System.out.println(num + " ");
       }
    }

     static int [] productExceptSelf(int []arr){

        int n = arr.length;

        int []res = new int [n];

         res[0] = 1;

         for (int i = 1 ; i <arr.length; i++){

             res[i] = res[i -1] * arr[i-1];
         }
         int right= 1;

         for (int i = n -1 ; i >=0; i--){

             res[i] = right * res[i];

             right = right * arr[i];
         }

         return res;
     }


}
