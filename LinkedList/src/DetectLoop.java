public class DetectLoop {

    public static void main  (String []args) {

        Node5 head = new Node5(1);

     boolean result  =   detectloop(head);
     System.out.println(result);

    }

public static boolean detectloop(Node5 head){

       head.next = new Node5(3);

       head.next.next = new Node5(4);


       Node5 loopnode = head.next;

       head.next.next.next = loopnode;



        Node5 slow = head;
        Node5 fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                return true;
            }
        }
        return false;

    }
}


class Node5{

    int data;
    Node5 next;

    Node5(int data){
        this.data = data;
        this.next = null;
    }



}