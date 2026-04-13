public class TrappingWater {
    public static void main (String[]args){

       int []arr = {3, 0, 1, 0, 4, 0, 2};

       System.out.println(maxWater(arr));
    }
    static int  maxWater(int []arr){


        int lmax = 0 ;
        int rmax  =0; ;
        int totalwater = 0 ;

        int i = 0 ; int j = arr.length-1;
        while (i < j) {

            lmax= Math.max(lmax, arr[i]);

            rmax = Math.max(rmax, arr[j]);

            if (arr[i]<= arr[j]){

                totalwater+= lmax -arr[i];

                i++;
            }
            else{

                totalwater+= rmax - arr[j];
                j--;
            }

        }
        return totalwater;
    }
}
