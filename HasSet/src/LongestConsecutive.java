import java.util.HashSet;

public class LongestConsecutive {

    public static void main (String[]args){

        int []arr = {2, 6, 1, 9, 4, 5, 3};
        System.out.println(longestConsecutive(arr));

    }
    static  int longestConsecutive(int[]arr){
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr){

            set.add(num);
        }

        int count = 0;
        int maxnumber = 0;

        for (int num : set){


            if(!set.contains(num -1)){

                int currentnum = num;
                count = 1;

                while (set.contains(currentnum + 1)){
                    currentnum++;
                    count++;
                }
                maxnumber = Math.max(maxnumber , count);
            }


        }

        return maxnumber;
    }

}
