public class ImplementationAtoi {

    public static void main(String[] args){

        String str = "-123";
        System.out.println(myAtoi(str));

    }

    public static int myAtoi(String str){

        int n = str.length();
        int result = 0 ;
        int sign = 1;
        int i = 0;


        while (i < n && str.charAt(i)== ' '){
            i++;
        }

        if (i < n && str.charAt(i) == '-' ){
            sign = -1 ;
            i++;
        } else if (i < n && str.charAt(i) == '+'){
            i++;
        }
        while (i < n && str.charAt(i) >= '0' && str.charAt(i) <= '9'){



            int digit = str.charAt(i) - '0';

            if (result > (Integer.MAX_VALUE - digit ) / 10) {
                return  sign == 1 ? Integer.MAX_VALUE: Integer.MIN_VALUE;
            }

            result = result *10 + digit;
            i++;
        }


        return  result* sign;
    }}


