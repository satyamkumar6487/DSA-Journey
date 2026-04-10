public class ContainerMostWater {


    public static void main (String[]args){

        int []arr = {1, 5, 4, 3};
System.out.println(maxwater(arr));


    }
static int maxwater(int []arr){


        int start = 0 ;
        int end = arr.length-1;

        int maxarea= 0;



      while (start < end){

          int area = Math.min(arr[start],arr[end]) * (end - start);

          maxarea= Math.max(maxarea, area);


          if (arr[start] < arr[end]){
              start++;
          }
              else {
                 end--;
              }
          }


return maxarea;




}


}
