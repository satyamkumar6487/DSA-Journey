//public class CheckInversionMergeSort {
//    public  static  void main (String [] args){
//
//        int [] arr = {2 , 4 , 1 , 3 , 5};
//
//        int left = 0 , right = arr.length-1;
//System.out.println(sortmerge(arr,left,right));
//    }
//
//    static int sortmerge(int [] arr , int left , int right ){
//int count = 0 ;
//
//
//        if (left < right){
//
//            int mid = (left + right)/2 ;
//
//            count+=  sortmerge( arr, left , mid);
//           count +=   sortmerge(arr, mid + 1 , right);
//            count +=  merge(arr, left , mid , right);
//
//
//        }
//
//
//
//        return 0;
//    }
//
//}
