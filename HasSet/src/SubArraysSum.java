import java.util.HashMap;

public class SubArraysSum {

    public static  void main (String[] args){


        int []arr = {10, 2, -2, -20, 10};

        int k = -10;

        System.out.println(subarraysum(arr,k));
    }

    static  int subarraysum(int []arr, int k){

        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0 ,1);
        int count = 0;
        int sum = 0 ;

        for (int i = 0 ; i < arr.length; i++){

            sum += arr[i];

            if (map.containsKey(sum - k)){
                count += map.get(sum - k);
            }


            map.put(sum, map.getOrDefault(sum , 0) + 1);

        }

        return count;




    }

}
