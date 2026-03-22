import java.util.ArrayList;
import java.util.HashSet;

public class Union {

    public static void main (String []args){


        int []a = {1, 2, 3, 2, 1};
        int []b = {3, 2, 2, 3, 3, 2};
HashSet<Integer> result = findunion(a,b);
        System.out.println(result);

    }

     static HashSet<Integer> findunion(int []a, int[]b){

        HashSet<Integer> store = new HashSet<>();

        for (int num : a){
            store.add(num);
        }
        for (int num : b){
            store.add(num);
        }

return store;

    }



}
