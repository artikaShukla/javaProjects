package LinkedList;

public class InsertionAndDeletionSimpleLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    // insert at beginning of node time complexity is 0(1)
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //insert after any node time complexity is 0(1)
    public void insertAfter(Node prev, int newData) {

        if (prev == null) {
            System.out.println("This cannot be null");
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = prev.next;
        prev.next = newNode;

    }

    // Complexity is O(n) since there is a loop from head to end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        newNode.next = null;

        if (head == null) {
            head = new Node(data);
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;

        }
        last.next = newNode;
        return;
    }

    public static void main(String[] args) {
        InsertionAndDeletionSimpleLinkedList insertionSimpleLinkedList = new InsertionAndDeletionSimpleLinkedList();

        // insertionSimpleLinkedList.head = new Node(1);
        insertionSimpleLinkedList.push(0);
        insertionSimpleLinkedList.push(1);
        insertionSimpleLinkedList.push(2);
        insertionSimpleLinkedList.push(3);
        insertionSimpleLinkedList.push(4);
        // System.out.println(insertionSimpleLinkedList.head.data);
        insertionSimpleLinkedList.insertAfter(insertionSimpleLinkedList.head.next.next, 6);
//        insertionSimpleLinkedList.insertAtEnd(9);
        insertionSimpleLinkedList.printNodes();


    }


    public void printNodes() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }
}
