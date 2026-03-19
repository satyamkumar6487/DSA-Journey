public class SearchSortedMatrix {
    public static void main(String[] args) {


        int arr[][] = {{1, 5, 9},
                {14, 20, 21},
                {30, 34, 43}};

        int x = 14;
        boolean result = search(arr,x);
        System.out.println(result);
    }

    static boolean  search(int  [][]arr , int x ){


        int n = arr.length;
        int m = arr.length;

        int start = 0 ;
        int end = n*m-1;

        while (start <= end)
        {

            int mid = start + (end - start);

            int value = arr[mid/m][mid%m];

            if (value == x ){
                return true;
            }
            else if(value < x){
                start = mid+1;

            }
            else {
                end = mid -1;
            }
        }
        return false;
    }
}
