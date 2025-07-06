package Kunal.LinkedList;

public class LinkedList {
    private  class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    private Node head,tail;
    private int size;
    LinkedList(){
        this.size = 0;
    }


    //Insertion
    public void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        if (tail == null){
            tail = head;
        }

        size += 1;
    }
    public void insertLast(int data){
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = tail.next;

        if(head == null){
            head = tail;
        }

        size += 1;
    }

    public void insertAt(int data, int index){
        if (index == 0){
            insertFirst(data);
            return;
        }
        if (index == this.size){
            insertLast(data);
            return;
        }

        int currIndex = 0;
        Node newNode =  new Node(data);
        Node currNode = head;
        while (currIndex < index - 1 && currNode!= null ){
            currNode = currNode.next;
            currIndex++;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;

        this.size +=1;

    }

    //delete the node
    public void deleteFirst(){
        head = head.next;
        if (head == null){
            tail = null;
        }

        size--;
    }



    public void deleteLast(){
        if (size <= 1){
            deleteFirst();
            return;
        }

        Node preLast = get(size - 2);
        tail = preLast;
        tail.next = null;
        size--;
    }

    //get Index Node

    public Node get(int index){
        Node temp = head;
        for(int i = 0;i < index ;i++){
            temp = temp.next;
        }
        return temp;
    }


    //getting size of the Linkedlist
    public int getSize(){
        return this.size;
    }

    //display all the elements in LinkedList
    public void traverse(){
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data+" ---> ");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }
}
