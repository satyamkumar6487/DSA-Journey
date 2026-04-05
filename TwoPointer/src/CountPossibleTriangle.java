import java.util.Arrays;

public class CountPossibleTriangle {

    public static void main (String[] args){

        int []arr = {4, 6, 3, 7};

        System.out.println(countTriangle(arr));
    }

    static  int countTriangle(int []arr){

        Arrays.sort(arr);
        int n = arr.length;

        int count = 0;

        for (int k = n-1 ; k >= 2; k--){

            int j = k -1;

            int i = 0;

            while (i < j){

                if (arr[i] + arr[j] > arr[k]){

                    count += (j-i);

                    j--;
                } else{
                    i++;
                }

            }



        }
        return count;

    }


}
