public class ChcekInversion {
    public static void main(String [] args){

       // int [] arr = {2, 4, 1, 3, 5};

        int [] arr = {2, 4, 5, 6, 7};
        System.out.println(checkinversion(arr));
    }

    static  int checkinversion(int []arr){

        int n = arr.length;
        int count = 0;
        for (int i = 0 ; i < n-1; i++){


            for (int j = i+1; j < n ; j++ ){

                if (arr[i] > arr[j]){
                    count++;

                }
            }

        }
return count;

    }
}
