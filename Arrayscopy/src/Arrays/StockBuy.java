package Arrays;

public class StockBuy {

    public static void main (String[] args){

        int [] arr = {7, 10, 1, 3, 6, 9, 2};

        System.out.println(maxprofit(arr));


    }

  public    static int maxprofit(int [] arr){

        int n = arr.length;

        int minprice = arr[0];
        int maxprofit = 0;

        for (int i = 1 ; i < n; i ++){

            if (arr[i] < minprice){

                minprice = arr[i];

            }

            int profit = arr[i] - minprice;

             maxprofit = Math.max(maxprofit , profit);


        }
return maxprofit;


    }



}
