public class FirstLoopLL {

    public static void main (String[]args) {

        int[] arr = {1, 3, 2, 4, 5};



        System.out.println( cycleStart(arr));


    }

     public static int  cycleStart(int  []arr){
         Node6 head = new Node6(arr[0]);
    Node6 temp = head;

    Node6 loopNode  = null;
    for (int i = 1 ; i < arr.length; i ++) {
        temp.next = new Node6(arr[i]);
        temp = temp.next;
        if (i == 1){
            loopNode = temp;
        }
    }
    temp.next = loopNode;


    Node6 slow = head;

    Node6 fast  = head;


    while (fast!= null && fast.next!=null){

        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast){

            Node6 start = head;

            while (slow!= start){

                start = start.next;
                slow = slow.next;
            }

           return start.data;

        }
    }


    return -1;
    }

}


class Node6{

    int data;
    Node6 next;


    Node6 (int data){
        this.data = data;
        this.next = null;
    }

}