import java.util.HashMap;
import java.util.HashSet;

public class TwoSumPair {
    public static void main (String [] args){

        int []arr = {0, -1, 2, -3, 1};

        int target = -2;

        boolean result = findpair(arr, target);
        System.out.println(result);
    }

    static boolean findpair(int []arr, int target){
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0 ; i < arr.length; i++){

            int need = target - arr[i];

         if ( set.contains(need)){
                return true;
            }

            set.add(arr[i]);
        }

return false;

    }

}
