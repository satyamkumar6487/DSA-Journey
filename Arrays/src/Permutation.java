public class Permutation {

    public  static void main  (String [] args){
        // int [] arr = {2, 4, 1, 7, 5, 0};
        //int [] arr = {3,2,1,};

        int [] arr = {3, 4, 2, 5, 1};


        int piviot = -1 ;
        for (int i = arr.length-2 ; i >= 0 ; i --){


            if (arr[i] < arr[i +1 ]){

                piviot = i ;
                break ;
            }
        }

        if (piviot != -1 ) {
            int j = -1;

            for (int i = arr.length - 1; i > piviot; i--) {
                if (arr[i] > arr[piviot]) {
                    j = i;
                    break;

                }
            }
            swap(arr, piviot, j);



            int start = piviot +1 ;

            int end = arr.length-1 ;

            while (start < end){

                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp ;
                start++;
                end--;
            }}
        else {
            int start = 0, end = arr.length - 1;
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

        }




        for (int x: arr){
            System.out.print(x);
        }
    }



    public  static void swap(int[] arr, int i, int j){
        int temp = arr [i] ;
        arr[i] = arr[j];
        arr[j] = temp;



    }






}
