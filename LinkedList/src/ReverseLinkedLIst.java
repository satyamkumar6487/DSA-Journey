public class ReverseLinkedLIst {

    public static void main (String [] args){

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);


        n1.next= n2;

        n2.next = n3;

        n3.next = n4;

        n4.next = null;


        Node curr = n1;

        Node prev = null;

while (curr!= null){

    Node next = curr.next;

    curr.next = prev;

    prev = curr;
    curr = next;

}

Node temp = prev;
while (temp!= null){
    System.out.println(temp.data);

    temp = temp.next;
}

    }

}

class Node {

    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}