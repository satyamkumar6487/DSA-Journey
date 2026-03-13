public class AllocateMinimumPage {
    public static void main (String []args){

        int []arr = {12, 34, 67, 90};


        int k = 2 ;
        System.out.println(findpage(arr,k));

    }

    static int findpage (int []arr , int k){

        if(arr.length < k){
            return -1;
        }

        int sum = 0 ;

        int ans = -1 ;

        for (int i = 0 ; i <arr.length; i++){
            sum += arr[i];
        }

        int start = 0 ;
        int end = sum;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if (isvalid(arr , k , mid)){

                end = mid -1;
                ans = mid;

            } else {

                start = mid +1 ;
            }

        }
return ans;





    }

    private static boolean isvalid(int[] arr, int k, int mid) {

        int student = 1;
        int page = 0 ;

        for (int i = 0 ; i <arr.length; i ++){

            if (arr[i] > mid){
                return false;
            }

            if (arr[i] + page <= mid){

                page += arr[i];
            }
            else {
                student++;
                page = arr[i];
            }

        }
        return  student <= k;


    }
}
