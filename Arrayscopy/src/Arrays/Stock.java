package Arrays;

public  class Stock {

    public static void main(String[] args) {

        int[] price = {100, 180, 260, 310, 40, 535, 695};

        System.out.println(maxprofit(price));

    }

    static int maxprofit(int[] price) {
        int profit = 0 ;

        for (int i = 1  ; i <price.length ; i ++){

            if (price[i] > price[i -1 ]){

                profit += price[i] - price[i-1];
            }


        }
        return profit;


    }

}