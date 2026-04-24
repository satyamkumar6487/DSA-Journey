import java.sql.Struct;

public class AddLL {

    public static void main (String []args) {

        int[] arr = {1, 2, 3};

        Node4 head1 = new Node4(arr[0]);

        Node4 temp1 = head1;
        for (int i = 1; i < arr.length; i++) {

            temp1.next = new Node4(arr[i]);
temp1 = temp1.next;

        }

        Node4 head2 = new Node4(9);

        head2.next = new Node4(9);

        head2.next.next = new Node4(9);



        head1  = reverse (head1);

        head2 = reverse(head2);


        Node4 dummy = new Node4(0);

        Node4 temp = dummy;



        int carry = 0 ;

        while (head1 != null || head2 != null || carry!= 0){

            int sum = carry;

            if (head1!= null){

                sum += head1.data;
                head1 = head1.next;
            }
            if (head2 != null){
                sum += head2.data;

                head2 = head2.next;
            }


            temp.next = new Node4(sum % 10);

            carry = sum / 10;

            temp = temp.next;
        }


        Node4 result = reverse(dummy.next);

        while (result!= null && result.data==0){
            result = result.next;
        }

        while (result != null){
            System.out.println(result.data);

            result = result.next;
        }
        System.out.println("null");


    }


      static   Node4 reverse(Node4 head) {
          Node4 prev = null;

          while (head != null) {

              Node4 next = head.next;

              head.next = prev;

              prev = head;
              head = next;

          }
return prev;





      }

}
class Node4 {

    int data;

    Node4 next;

    Node4(int data){

        this.data = data;
        this.next=null;
    }


}