public class RotateLL {

    public static  void main (String []args){
        Node1  n1 = new Node1(10);

        Node1  n2 = new Node1(20);
        Node1  n3 = new Node1(30);
        Node1  n4 = new Node1(40);
        Node1  n5= new Node1(50);


        n1.next= n2;
        n2.next = n3;
        n3.next = n4 ;
        n4.next = n5;
        n5.next = null;

        Node1 head = n1;

        int k = 4 ;

        Node1 temp = n1;
        while (temp.next != null){
            temp = temp.next;
        }

        Node1 curr = n1;

        for (int i = 1 ; i < k; i++){

            curr= curr.next;

        }

        Node1 newnode = curr.next;
        curr.next = null;

        temp.next = head;


        Node1 print = newnode;
        while (print != null){
            System.out.println(print.data);
            print = print.next;
        }
        System.out.println("NULL");
    }

}

class Node1{

    int data;
    Node1  next;

    Node1(int data){
        this.data = data;
        this.next = null;
    }
}