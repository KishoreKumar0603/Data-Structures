package Yt;


class LL{
    class Node {
        private int val;
        private Node next;
    
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
        
    }

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }
    

  
    public void InsertAtFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if(tail == null) tail = head;

        size++;
    }

    public void InsertAtLast(int val){
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        if (head == null) head = tail;
        size++;
    }

    public void insertAtIndex(int val, int index){
        if(index == 0){
            InsertAtFirst(val);
            return;
        }
        if(index == size - 1){
            InsertAtLast(val); 
            return;
        }
        Node tempNode = head;
        int i = 0;
        while (i != index - 1 && tempNode != null) {
            tempNode = tempNode.next;
            i++;
        }
        Node node = new Node(val,tempNode.next);
        tempNode.next = node;
        size++;

    }

    public void deleteAtFirst(){
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public void deleteAtLast(){
        if(size <= 1){
            deleteAtFirst();
        }
        else{
            Node secondLastNode = getNode(size - 2);
            tail = secondLastNode;
            tail.next = null;
            size--;
        }
    }

    public void deleteIndex(int index){
        if(index == 0){
            deleteAtFirst();
        }
        else if(index ==  size - 1){
            deleteAtLast();
        }
        else{
            Node node =  getNode(index - 1);
            node.next = node.next.next;
            size--;
        }
    }

    public Node getNode(int index){
        if(index == 0) return head;
        if(index == size - 1) return tail;
        Node node =  head;
        for(int i = 0;i<index;i++)
        {
            node = node.next;
        }
        return node;
    }
    public void traverse(){
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.val + " -> ");
            tempNode = tempNode.next;
        }
        System.out.println("END");
    }

    public int size(){
        return size;
    }
}
public class SinglyLinkedList {

    public static void main(String[] args) {
        LL list = new LL();

        list.InsertAtFirst(0);
        list.InsertAtFirst(1);
        list.InsertAtFirst(2);
        list.traverse();
        list.InsertAtLast(10);
        list.InsertAtLast(20);
        list.traverse();

        list.insertAtIndex(77, 2);
        list.traverse();
        System.out.println(list.size());
        list.deleteAtFirst();
        list.traverse();
        System.out.println(list.size());
        list.deleteAtLast();
        list.traverse();
        list.deleteIndex(2);
        list.traverse();
        

    }
}
