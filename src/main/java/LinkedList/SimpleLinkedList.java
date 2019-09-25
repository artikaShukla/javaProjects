package LinkedList;

public class SimpleLinkedList {

    //static class so that main method can access it
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public static void main(String[] args) {
        SimpleLinkedList simpleLinkedList= new SimpleLinkedList();
        simpleLinkedList.head= new Node(1);
        Node second = new Node(2);
        Node third= new Node(3);

        simpleLinkedList.head.next= second;
        second.next= third;

        simpleLinkedList.printList();
    }

    //Prints content of linked list starting from head
    public void printList(){
        Node n= head;
        while (n!= null){
            System.out.println(n.data);
            n= n.next;
        }
    }


}
