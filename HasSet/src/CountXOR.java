import java.util.HashMap;

public class CountXOR {

    public static  void main (String []args){

        int []arr = {4, 2, 2, 6, 4};

        int x= 6;

        System.out.println(findxor(arr,x));
    }

    static  int findxor(int []arr , int x){

        HashMap<Integer , Integer> map = new HashMap<>();
        int xor = 0;

        int count = 0 ;
        map.put(0 , 1);

        for (int i = 0 ; i < arr.length; i++){

            xor ^= arr[i];

            if (map.containsKey(xor ^ x)){
                count += map.get(xor ^ x);
            }

            map.put(xor , map.getOrDefault(xor,0) + 1);

        }
        return  count;



    }
}

