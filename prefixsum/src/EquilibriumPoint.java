public class EquilibriumPoint {

    public static void main (String []args){

        int []arr = {1,2,0,3};

    }

    static  int findEquilibrium(int []arr) {

        int totalsum = 0;

        int leftsum = 0;

        for (int i = 0; i < arr.length; i++) {

            totalsum += arr[i];

        }

        for (int i = 0; i < arr.length; i++) {

            int rightsum = totalsum - leftsum - arr[i];
            if (rightsum == leftsum) {
                return i;
            }
                leftsum += arr[i];
            }


return -1;
    }
}
