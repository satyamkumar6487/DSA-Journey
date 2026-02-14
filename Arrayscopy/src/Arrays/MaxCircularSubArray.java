package Arrays;

public class MaxCircularSubArray {
    public static  void main (String []args){

        int [] arr = {8, -8, 9, -9, 10, -11, 12};

        System.out.println(circularArray(arr));
    }

    static int circularArray(int []arr){

        int n = arr.length;

        int currentMax = arr[0];
        int currentMin = arr[0];
        int Totalsum = arr[0];
        int maxnormal= arr[0];

        int minsub = arr[0];

        for (int i = 1 ; i < n ; i ++){

            Totalsum += arr[i];

            currentMax = Math.max(arr[i] , currentMax + arr[i]);


            maxnormal = Math.max(maxnormal , currentMax);

            currentMin = Math.min(arr[i] , currentMin + arr[i]);
            minsub = Math.min(minsub , currentMin);


        }

        if (maxnormal < 0){
            return maxnormal;
        }

        int maxcircular = Totalsum - minsub;

        return  Math.max(maxnormal , maxcircular);


    }

}

