import java.util.*;

class Node {
    int data;
    Node next;
    Node(int ele) {
        data = ele;
        next = null;
    }
}

class LinkedList {
    static Node head = null;
    static Node tail = null;

    public static void create(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }
    }

    public static void position(int pos, int val) {
        Node nn = new Node(val);
        if (pos == 1) {
            nn.next = head;
            head = nn;
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        nn.next = temp.next;
        temp.next = nn;
    }

    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class adding_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        LinkedList obj = new LinkedList();
        
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            obj.create(ele);
        }

        int pos = sc.nextInt(); 
        int val = sc.nextInt(); 

        if (pos < 1 || pos > n + 1) {
            System.out.println("Position out of range");
        } else {
            obj.position(pos, val);
            obj.display();
        }
    }
}