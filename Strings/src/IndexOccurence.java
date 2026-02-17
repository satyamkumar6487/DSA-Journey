import java.util.ArrayList;

public class IndexOccurence {
    public static void main(String[] args) {


        String s1 = "abcab";
        String pat = "ab";
        System.out.println(occurence(s1,pat));
    }

    static  ArrayList<Integer> occurence(String s1, String pat) {


        ArrayList<Integer> result = new ArrayList<>();
        int n = s1.length();
        int m = pat.length();

        for (int i = 0 ; i <= n - m ; i ++){

            if (s1.substring( i , i + m ).equals(pat)){
                result.add(i);
            }
        }
return   result;



    }
}