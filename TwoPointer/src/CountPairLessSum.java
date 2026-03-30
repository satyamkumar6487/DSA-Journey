import java.util.Arrays;

public class CountPairLessSum {

    public static  void main(String []args){

        int []arr = {7 , 2, 5, 3};
        int target = 8;

        System.out.println(countPairs(arr,target));
    }
    static  int countPairs(int []arr , int target){

        Arrays.sort(arr);
        int start = 0 ;

                int end = arr.length-1;
                int count = 0 ;

                while (start < end){

                    int sum = arr[start]+ arr[end];

                    if (sum  <  target){

                        count += (end - start);
                        start++;
                    }
                     else {
                        end--;
                    }
                }
                return count;
    }
}
