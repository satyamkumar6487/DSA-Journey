public class Citations {


    public static void main (String [] args){


         int  citations[] = {3, 0, 5, 3, 0};
         System.out.println(hindexfind(citations));

    }
    static int hindexfind(int [] citations) {

        int n = citations.length;
        int  hindex = 0 ;

        for (int h = 0; h <=n ; h++){

            int count = 0 ;
            for (int i = 0 ; i < n ; i ++){
                if (citations[i] >=  h){
                    count++;
                }
            }
            if(count >= h){
                hindex = h;
            }
        }
        return hindex;
    }


}
