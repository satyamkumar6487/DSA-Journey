import java.util.ArrayList;

public class IndexesSubarraySum {

    public static void main (String []args){

        int []arr = {1, 2, 3, 7, 5};
        int sumtarget = 12;

        System.out.println(subarraySum(arr,sumtarget));

    }
    static ArrayList<Integer> subarraySum(int []arr , int sumtarget){


        ArrayList<Integer> result = new ArrayList<>();

        int start = 0 ;
        int end = 0;
        int sum = 0 ;


        for (int i = 0 ; i < arr.length; i++){

            sum += arr[i];

            if (sum >= sumtarget){

                end = i;

                while (sum > sumtarget){

                    sum -= arr[start];
                    start++;
                }
                if (sum == sumtarget){

                    result.add(start + 1);
                    result.add(end + 1);

                    return result;
                }

            }



        }

        result.add(-1);
return result;

    }

}
