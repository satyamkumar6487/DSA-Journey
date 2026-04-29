public class GroupReverse {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 2;
        Node8 head = createList(arr);

        head = reverseKgroup(head, k);

        printList(head);
    }


    static Node8 createList(int[] arr) {

        Node8 head = new Node8(arr[0]);

        Node8 temp = head;

        for (int i = 1; i < arr.length; i++) {

            temp.next = new Node8(arr[i]);

            temp = temp.next;
        }
        return head;
    }

    static Node8 reverseKgroup(Node8 head, int k) {

        Node8 curr = head;
        Node8 prev = null;
        Node8 next = null;

        int count = 0;

        while (curr != null && count < k) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

            count++;

        }


        if (next != null) {


            head.next = reverseKgroup(next, k);
        }

        return prev;
    }


    static void printList(Node8 head) {

        Node8 print = head;

        while (print != null) {
            System.out.print(print.data + " -> ");
            print = print.next;

        }
        System.out.println("null");

    }

}

class Node8 {

    int data;

    Node8 next ;

    Node8(int data){


        this.data = data;
        this.next = null;

    }
}