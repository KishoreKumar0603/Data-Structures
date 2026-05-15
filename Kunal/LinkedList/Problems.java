package Kunal.LinkedList;

class Problems {

    public static void main(String[] args) {

//        LinkedList  list  = new LinkedList();
//
//        list.insertValues(new int[] {1,1,2});
//        list.insertValues(new int[] {1,1,2,3,3});
//
//        list.traverseList();
//        deleteDuplicates(list.head);
//        list.traverseList();

        LinkedList list1 = new LinkedList();
        list1.insertValues(new int[] {1,2,4});
        LinkedList list2 = new LinkedList();
        list2.insertValues(new int[] {1,3,4});
        mergeTwoLists(list1.head, list2.head);

    }

    public static void displayList(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }


    //https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/?envType=problem-list-v2&envId=linked-list
    public  static void  deleteDuplicates(Node head) {
        if(head == null || head.next == null) {
            return;
        }
        Node currentNode = head.next;
        Node prevNode = head;

        while(currentNode != null) {
            if(prevNode.value != currentNode.value) {
                prevNode.next = currentNode;
                prevNode = currentNode;
            }
            currentNode = currentNode.next;
        }

        prevNode.next = currentNode;
    }

    //https://leetcode.com/problems/merge-two-sorted-lists/?envType=problem-list-v2&envId=linked-list
    public static void mergeTwoLists(Node list1, Node list2) {
        LinkedList newList = new LinkedList();
        newList.insertAtFirst(0);
        Node currentNode = newList.head;
        while(list1 != null && list2 != null) {
            if(list1.value < list2.value) {
                currentNode.next = list1;
                list1 = list1.next;
            } else {
                currentNode.next = list2;
                list2 = list2.next;
            }
            currentNode = currentNode.next;
        }

        while(list1 != null) {
            currentNode.next = list1;
            list1 = list1.next;
            currentNode = currentNode.next;
        }
        while(list2 != null) {
            currentNode.next = list2;
            list2 = list2.next;
            currentNode = currentNode.next;
        }
        displayList(newList.head.next);
    }

}
