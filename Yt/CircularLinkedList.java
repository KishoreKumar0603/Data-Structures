package Yt;

class CLL{
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    public CLL(){
        this.head = null;
        this.tail  = null;
    }


    public void insertAtFirst(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail  = node;
            return;
        }

        tail.next = node;
        node.next = head;
        head = node;
    }
    public void insertAtLast(int val){
        Node node  = new Node(val);
        if(tail == null){
            head = node;
            tail = node;
            return;
        }

        node.next = head;
        tail.next = node;
        tail = node;
    }

    public void traverse(){
        Node node = head;

        if(head != null){
            do{
                System.out.print(node.val + " -> ");
                node = node.next;
            }while(node !=  head);
            System.out.println("HEAD");
        }
    }

    public void deleteAtFirst(){

        if(head == null || head == tail){
            tail = null;
            head = null;
            return;
        }
        tail.next  =  head.next;
        head= head.next;
    }

    public void deleteAtLast(){
        if(tail == null || head == tail){
            tail = null;
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }

        temp.next = head;
        tail = temp;
    }

    public int getTail(){
        return tail.val;
    }

    public int getHead(){
        return head.val;
    }
}
public class CircularLinkedList {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.traverse();
        list.insertAtLast(100);
        list.insertAtLast(40);
        list.insertAtLast(30);
        list.traverse();
        list.deleteAtFirst();
        list.traverse();
        list.deleteAtFirst();
        list.traverse();

        list.deleteAtLast();
        list.traverse();


        System.out.println("HEAD : " + list.getHead() +" TAIL : "+ list.getTail());
    }
}
