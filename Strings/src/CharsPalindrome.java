public class CharsPalindrome {

    public static void main (String[] args){

        String s1 = "abc";

System.out.println(longestprefix(s1));

    }

    static int longestprefix(String s1){

        String rev = new StringBuilder(s1).reverse().toString();

        String temp = s1 + "$ " + rev;

        int []lps = new int[temp .length()];


        int len = 0 ;
        int i = 1 ;

        while (i < temp.length()) {

            if (temp.charAt(i) == temp.charAt(len)){

                len++;
                lps[i] = len++;

                i++;
            }   else {

                if(len != 0){

                    len = lps[len -1 ];
                }
                lps[i] = 0 ;
                i ++;
            }

        }
return s1.length() - lps[temp.length() - 1 ];

    }

}
