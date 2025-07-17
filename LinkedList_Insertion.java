import java.util.*;
class Node{
    int data;
    Node next;
    Node(int ele){
        data=ele;
        next=null;
    }
}
class LinkedList{
    static Node head=null;
    static Node tail=null;
    public static void create(int data){
    Node nn=new Node(data);
        if(head==null){
            head=nn;
            tail=nn;
        }else{
            tail.next=nn;
            tail=nn;
        }
    }
    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}

public class LinkedList_Insertion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ele;
        LinkedList obj=new LinkedList();
        for(int i=0;i<n;i++){
            ele=sc.nextInt();
            obj.create(ele);
        }
        obj.display();
    }
}