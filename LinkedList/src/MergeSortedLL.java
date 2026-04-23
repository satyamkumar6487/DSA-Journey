public class MergeSortedLL {

    public static void main (String []args){

      int []arr = {5 , 10 , 15 , 40};

      Node2 head1 = new Node2(arr[0]);

      Node2 temp = head1;
      for (int i = 1 ; i < arr.length; i++){

          temp.next = new Node2(arr[i]);
          temp = temp.next;
      }

      Node2  head2 = new Node2(2);

      head2.next = new Node2(3);
      head2.next.next = new Node2(20);


      Node2 dummy = new Node2(0);

      Node2 tail = dummy;


      while(head1 != null && head2 != null){

          if (head1.data < head2.data){

              tail.next = head1;
              head1 = head1.next;

          }else{

              tail.next = head2;
              head2 = head2.next;
          }

tail = tail.next;
      }


      if (head1 != null){

          tail.next= head1;
      }
      else{
          tail.next = head2;
      }

      Node2 print = dummy.next;

      while (print != null){

          System.out.println(print.data);
          print = print.next;
      }
      System.out.println("NULL");
}}

class Node2{


    int data;
    Node2 next;

    Node2(int data){

        this .data = data;
        this.next = null;

    }

}