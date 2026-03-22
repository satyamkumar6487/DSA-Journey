import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Intersect {

    public static  void main (String []args){


        int []a = {1,2,1,3,1};
        int []b = {3,1,3,4,1};

        ArrayList<Integer> results = intersect(a,b);

        Collections.sort(results);
        System.out.println(results);

    }

  static    ArrayList <Integer> intersect(int []a , int []b){

        HashSet<Integer> storeNum = new HashSet<>();

        ArrayList<Integer> result = new ArrayList<>();

        for (int num : a){
            storeNum.add(num);
        }

        for (int num : b){

            if (storeNum.contains(num)){
                result.add(num);
                storeNum.remove(num);
            }
        }
        return  result ;
    }
}
