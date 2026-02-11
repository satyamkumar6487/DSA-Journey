public class MaximumProductSubArray {

    public static void main (String [] args){

        int []arr ={-2, 6, -3, -10, 0 };
        System.out.println(maximumproduct(arr));


    }

    static int maximumproduct(int []arr){

        int n = arr.length;


        int maximum = arr[0];
        int minimum = arr[0];

        int ans = arr[0];



        for (int i = 1 ; i < n; i++){
            int current = arr[i];

            int temp =Math.max(current,
                    Math.max(maximum * current , minimum* current));

            minimum = Math.min(current ,
                    Math.min(maximum* current, minimum * current));


            maximum = temp;

            ans = Math.max(ans , maximum);

        }
        return ans;

    }

}
