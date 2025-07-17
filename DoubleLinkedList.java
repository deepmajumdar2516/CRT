import java.util.Scanner;

class Node {
    int bookID;
    Node prev;
    Node next;

    Node(int id) {
        this.bookID = id;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    void append(int id) {
        Node newNode = new Node(id);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.bookID + " ");
            current = current.next;
        }
    }
}

public class DoubleLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        DoublyLinkedList catalog = new DoublyLinkedList();

        for (int i = 0; i < N; i++) {
            int bookID = scanner.nextInt();
            catalog.append(bookID);
        }

        catalog.printList();
    }
}


