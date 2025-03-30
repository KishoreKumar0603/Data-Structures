package Yt;

class DLL{
    class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev)
        {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }


    private Node head;
    private Node tail;
    private int size;

    public DLL()
    {
        this.size = 0;
    }

    public void InsertAtFirst(int val)
    {
        Node node = new Node(val);
        node.prev = null;
        if(head == null){
            head = node;
            tail = node;
        }
        else
        {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void InsertAtLast(int val){
        Node node = new Node(val);
        if(tail == null)
        {
            tail = node;
            head =  node;
        }
        else{
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }
    public void traverse(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val +" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void reverse(){
        Node temp = tail;
        while(temp != null) {
            System.out.print(temp.val +" -> ");
            temp = temp.prev;
        }
        System.out.println("END");
    }

    public int size(){
        return size;
    }
    public int getTail(){
        return tail.val;
    }
    public void printHead(){
        System.out.println("value : "+ head.val + " next : " + head.next.val + " prev : " + head.prev);
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        
        DLL list = new DLL();
        list.InsertAtFirst(10);
        list.InsertAtFirst(20);
        list.InsertAtFirst(30);
        list.traverse();

        list.InsertAtLast(100);
        list.InsertAtLast(200);
        list.traverse();
        System.out.println(list.getTail());
        // list.printHead();
        list.reverse();
        
    }
}
