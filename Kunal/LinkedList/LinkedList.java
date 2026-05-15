package Kunal.LinkedList;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
public class LinkedList {

    Node head;
    public LinkedList() {

    }

    public void insertAtFirst(int value) {
        if(head == null) {
            head = new Node(value);
            return;
        } else {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertValues(int[] values)  {
        for(int i : values) {
            insertAtLast(i);
        }
    }
    public void insertAtLast(int value) {
        if(head == null) {
            head = new Node(value);
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(value);
        temp.next = newNode;
    }

    public void insertRecur(int value, int index) {
        head = insertRecur(value,index, head);
    }
    public Node insertRecur(int value,  int index, Node currentNode) {

        if(index == 0) {
            Node newNode = new Node(value, currentNode);
            return newNode;
        }

        currentNode.next = insertRecur(value, index--, currentNode.next);
        return currentNode;
    }

    public void traverseList() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

}
