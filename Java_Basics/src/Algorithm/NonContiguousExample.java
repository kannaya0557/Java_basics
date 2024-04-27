package Algorithm;

public class NonContiguousExample {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        // Nodes are linked together but are not stored in contiguous memory locations.

        // Traverse the linked list and print the values of each node
        Node current = head; // Start with the head of the list
        while (current != null) {
            System.out.println(current.data);
            current = current.next; // Move to the next node
        }
    }
}
