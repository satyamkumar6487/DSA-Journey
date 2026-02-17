public class NonRepeatingString {

    public static void main ( String [] args){


        String s1 =  "geeksforgeeks";
        int  freq [] = new int [26];

        System.out.println(nonrepeting(s1,freq));




    }

    public static char nonrepeting(String s1 , int [] freq) {

        for (int i = 0 ; i < s1.length(); i++){
            freq[s1.charAt(i)  - 'a'] ++;
        }

        for (int i = 0 ; i <  s1.length(); i++){

           if (freq[s1.charAt(i) - 'a' ] == 1){

               return s1.charAt(i);
           }
        }
return '$';

    }
}
