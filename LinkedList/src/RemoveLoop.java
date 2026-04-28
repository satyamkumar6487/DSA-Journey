public class RemoveLoop {

    public static  void main (String []args)
    {

        int []arr= {1,3,4};
   Node7 head =   removeloop(arr);

prtintList(head);

    }

    static Node7  removeloop(int []arr){ // function creates and returns head

        Node7 head = new Node7(arr[0]);

        Node7 temp = head;

        Node7 loopNode = null;

        for (int i = 1 ; i < arr.length; i++){

            temp.next = new Node7(arr[i]);

            temp = temp.next;

            if (i == 1){

                 loopNode = temp; // create loop
            }

        }

        temp.next = loopNode;


        Boolean isLoop = false;

        Node7 slow = head;

        Node7 fast = head;

        while (fast!= null && fast.next!= null){

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){

                isLoop = true;
                break;
            }

        }


        if (!isLoop)
return head;



        slow = head;


        if (slow == fast){

            while (fast.next != slow){
                fast = fast.next;
            }
        }

        else {

            while(slow.next != fast.next){

                slow = slow.next;
                fast = fast.next;
            }
        }

fast.next = null;

        return head;


    }



static void prtintList(Node7 head){


        Node7 print = head;

        while (print!= null){
            System.out.print(print.data + " -> ");

            print = print.next;
        }

        System.out.println("null");

}}

class Node7 {

    int data;

    Node7 next;


    Node7(int data){

        this.data = data;
        this.next = null;
    }
}