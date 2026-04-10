import java.util.Arrays;
import java.util.HashSet;

public class LongestSubString {

    public static  void main (String[]args){


        String [] s1 = {"geeksforgeeks"};

        System.out.println (longestUniqueSubstring(Arrays.toString(s1)));
    }

    static  int longestUniqueSubstring(String s1){


        HashSet<Character> set = new HashSet<>();

        int left = 0 ;
        int maxlen = Integer.MIN_VALUE;


        for (int right = 0 ; right < s1.length(); right++){

            while(set.contains(s1.charAt(right))){
                set.remove(s1.charAt(left));
                left++;
            }


            set.add(s1.charAt(right));
            maxlen = Math.max(maxlen , right - left + 1);
        }
return maxlen;
    }
}
