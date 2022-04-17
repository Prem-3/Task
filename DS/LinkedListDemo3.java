
class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // insertion AtFirst
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
//insert AtEnd
    public void insertAtEnd(int data) {
        if (head == null) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedListDemo3 {
    public static void main(String[] args) {
        LinkedList node = new LinkedList();
        node.insertAtFirst(10);
        node.insertAtFirst(20);
        node.insertAtEnd(30);

        node.display();
    }
}
