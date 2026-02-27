public class Minimum {
    public static void main (String [] args){

        int [] arr = {5, 6, 1, 2, 3, 4};
        System.out.println(findminimum(arr));
    }

    static  int findminimum(int []arr){
        int low = 0 ;
        int high = arr.length-1;

        while (low < high){
            int mid = low + (high - low) / 2;

            if (arr[mid] > high) {

                low = mid +1 ;
            }
            else {
                high = mid;
            }
        }
           return arr[low];
    }
}
