import java.util.*;

public class TripletsZeroSum {

    public static  void main (String []args) {


        int []arr = {0, -1, 2, -3, 1};
        List<List<Integer>> Answer = findTriplets(arr);

System.out.println(Answer);
    }
     static  List<List<Integer>> findTriplets(int []arr){



int n = arr.length;
List<List<Integer>> result = new ArrayList<>();
for (int i = 0 ; i < n-2; i++){
    HashMap<Integer , Integer> set = new HashMap<>();

    for (int j= i+1; j <n; j++){


        int required = -(arr[i] + arr[j]);


        if (set.containsKey(required)){

            int k = set.get(required);

            List<Integer> triplet = Arrays.asList(i ,k, j);
                Collections.sort(triplet);

                result.add(triplet);

            }

        set.put(arr[j] , j);
        }

    }


return  result;
}


    }


