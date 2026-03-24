import java.util.HashMap;

public class CountPair {
    public static void main (String[]args){

       // int []arr = {1, 5, 7, -1, 5};
        //    int target = 6 ;

        int arr[] = {1, 1, 1, 1}, target = 2;


        System.out.println(countPairs(arr,target));
    }

    static  int   countPairs( int []arr , int target){

        HashMap <Integer , Integer> map = new HashMap<>();


        int count = 0 ;



        for (int i = 0 ; i < arr.length; i++){


            int need = target - arr[i];

            if (map.containsKey(need))
            {
              count+=   map.get(need);
            }

            map.put(arr[i] , map.getOrDefault(arr[i] , 0 ) + 1 );
        }

        return count;
    }

}
