public class SearchElement {

    public static void main (String []args) {

        int[][] arr = {

                {3, 4, 9},
                {2, 5, 6},
                {9, 25, 27}};

        int x = 9;

        boolean result = findelement(arr, x);
        System.out.println(result);



    }
        public static  boolean findelement(int [][]arr , int x){

        int n = arr.length;  // row length

            int m = arr[0].length;

            for (int i = 0 ; i < n ; i ++){


                int start = 0 ;
                int end = m-1;

                while (start <= end){
                    int mid = start + (end - start) /2;

                    if (arr[i][mid] == x){
                        return true;
                    }
                    else if (arr[i][mid] < x){
                        start = mid + 1;
                    } else {
                        end = mid-1;
                    }
                }



        }
            return false;


        }

    }

