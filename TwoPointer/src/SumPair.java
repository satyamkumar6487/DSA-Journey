import java.util.ArrayList;
import java.util.Arrays;

public class SumPair {

    public static  void  main (String []args){

        int []arr = {10 , 30 , 20 , 5};
        int target = 25;

System.out.println(sumClosest(arr,target));

    }

  static   ArrayList<Integer> sumClosest(int []arr, int target){

        ArrayList<Integer> result = new ArrayList<>();

        if (arr.length  < 2)
            return result;

        Arrays.sort(arr);

        int mindif = Integer.MAX_VALUE;

int start = 0 ;
int end = arr.length-1;

int a = 0 ;
int b = 0 ;
while (start < end){

    int sum = arr[start] + arr[end];

    int diff  = Math.abs(target - sum);
    if (diff < mindif){

        mindif = diff;

        a= arr[start];
        b = arr[end];
    }
    if (sum < target){
        start++;
    } else {
        end--;
    }

}

result.add(a);
result.add(b);
return result;

    }

}
