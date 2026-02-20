public class StringRotation {
     public static void main (String [] args){

         String s1 = "abcd" , s2 = "cdab";
System.out.println(StringRotations(s1, s2));

     }
    static boolean StringRotations(String s1  , String s2){

         if (s1.length() != s2.length()){
             return false;

         }

         String temp = s1 + s1;

         return temp.contains(s2);

    }

}
