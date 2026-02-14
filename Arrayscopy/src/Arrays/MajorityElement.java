package Arrays;

import java.util.ArrayList;

public class MajorityElement {

    public static void main (String [] args) {

        int[] arr = {2, 2, 3, 1, 3, 2, 1, 1};

        ArrayList<Integer> res = findmajority(arr);
        System.out.println(res);


    }

    static  ArrayList<Integer> findmajority(int [] arr){

        int n = arr.length;
        ArrayList <Integer> store = new ArrayList<>();

        for (int i = 0 ; i <n ; i++){

            int count = 0 ;

            for (int j = i; j < n; j++){

                if (arr[j] == arr[i] ){
                    count++;

                }

            }

            if (count > n/3){

                // if (store.size() == 0 || store.get(0) !=arr[i]){
                if (!store.contains(arr[i])) {

                    store.add(arr[i]);
                }
            }




        }
        return store;


    }



}