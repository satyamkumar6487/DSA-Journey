public class SearchElemnt2 {
    public static void main (String [] args){

        int [][] arr = {{18,21,27},
                {20,52,54}};
        int x = 62;

        boolean result = search(arr,x);
        System.out.println(result);
    }

    public static  boolean search(int [][]arr, int x){


        int n = arr.length;
        int m = arr[0].length;

        int row = 0 ;
        int col = m - 1;

        while ( row < n && col >= 0){

            if (arr[row][col] == x){

                return  true;
            } else if (arr[row][col] > x) {
                col--;

            } else {
                row++;
            }

        }
        return false;

    }


}
