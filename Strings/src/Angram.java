public class Angram {
    public static void main  (String [] args){

        String s1 = "geeks" ;
        String s2 = "kseeg";


        int freq [] = new int[26];

        System.out.println(frequency(s1 , s2, freq));



    }
    static boolean frequency (String s1 , String s2 , int [] freq){

        if (s1.length() !=  s2.length()){
            return false;
        }

        for (int i = 0 ; i < s1.length(); i ++){
            freq[s1.charAt(i) - 'a'] ++;
            freq[s2.charAt(i) - 'a'] --;


        }

        for (int i = 0 ; i < 26; i++){

            if (freq[i] != 0 ){
                return  false;
            }
        }
return  true;
    }


}