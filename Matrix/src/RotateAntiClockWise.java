public class RotateAntiClockWise {

    public static void main (String []args){

        int arr [][] = {{0,1,2},
                {3,4,5},
                {6,7,8}};

        rotate(arr);
        for (int i = 0 ; i <arr.length;i++){
            for (int j = 0 ; j < arr.length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();

        }}


    static void  rotate(int [][]arr){

        int n = arr.length;

        for(int i = 0 ; i <n; i++ ){

            for (int j = i ;j <n; j++){

                int temp = arr[i][j];

                arr[i][j] = arr[j][i];

                arr[j][i] = temp;


            }
        }

        for (int j = 0 ; j<n; j++) {

            int top = 0;
            int bottom = n - 1;
            while (top < bottom) {
                int temp = arr[top][j];

                arr[top][j] = arr[bottom][j];

                arr[bottom][j] = temp;

                top++;
                bottom--;

            }
        }

    }
}
