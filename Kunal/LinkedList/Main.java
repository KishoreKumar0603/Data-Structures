package Kunal.LinkedList;

public class Main {
    public static void main(String[] args) {
      LinkedList list = new LinkedList();
      list.insertAtFirst(8);
      list.traverseList();
      list.insertAtFirst(0);
      list.insertAtFirst(11);
      list.insertAtFirst(12);
      list.insertAtFirst(14);
      list.traverseList();
      list.insertRecur(32, 0);
      list.traverseList();
    }
}
