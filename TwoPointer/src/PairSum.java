public class PairSum {

    public static  void main (String [] args){
        int [] arr = {-1, 1, 5, 5, 7};
        int target = 6 ;

        System.out.println(countpair(arr, target));
    }
    static  int countpair(int [] arr, int target){
int ans= 0;

        int start = 0 ;
        int end = arr.length-1;


        while (start < end){

        int sum = arr[start] + arr[end];

        if (sum < target){
            start++;
        }  else if (sum > target){
            end--;
        }
        else {

            int element1 = arr[start];
            int elements2 = arr[end];

            int count1 = 0;
            int count2 = 0;

            while( start <= end &&arr[start] == element1){
                count1++;
                start++;
            }

            while ( start <= end && arr[end] == elements2){
                count2++;
                end--;
            }

            if( element1 == elements2){
                ans += count1*(count1 -1)/2;
            } else {

                ans += count1 * count2;
            }
        }}

return  ans;
    }
}
