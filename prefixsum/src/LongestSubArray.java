import java.util.HashMap;
import java.util.HashSet;

public class LongestSubArray {

    public static void main (String[]args){

        int []arr = {10, 5, 2, 7, 1, -10 };
int k = 15;

System.out.println(longestSubarray(arr , k  ));
    }

    static int  longestSubarray(int []arr , int k ){

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int sum = 0 ;
        int maxlen= 0 ;

        for (int i = 0 ; i <n ; i++){

            sum +=arr[i];

            if (sum == k){

                maxlen = i + 1;
            }

            if (map.containsKey(sum - k)){

            maxlen = Math.max(maxlen, i - map.get(sum-k));

            }
            if (!map.containsKey(sum)){
                map.put(sum , i);
            }

        }

return maxlen;

    }
}
