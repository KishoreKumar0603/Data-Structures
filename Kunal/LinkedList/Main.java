package Kunal.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        list.getSize();


        //insertion at first
        list.insertFirst(10);
        list.insertFirst(11);
        list.insertFirst(12);
        list.insertFirst(13);
        list.insertFirst(14);

        //Displaying the linkedlist elements
        list.traverse();

        //Insertion at Last
        list.insertLast(15);
        list.insertLast(16);
        list.insertLast(17);
        list.insertLast(18);

        //display the elements
        list.traverse();

        //Insertion at index
        list.insertAt(-1, 4);
        list.traverse();


        //delete at First
        list.deleteFirst();
        list.traverse();


        //delete at Last
        list.deleteLast();
        list.traverse();

        
    }
}
