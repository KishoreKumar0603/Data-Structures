class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class Linked
{
    Node head;
    void traverseList()
    {
        Node curr = head;
        while (curr.next!=null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.print(curr.data);
    }


    void Insert(int element)
    {
        Node temp = new Node(element);
        if(head == null)
        {
            head = temp;
        }
        else
        {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }

            curr.next = temp;
            temp.next = null;
        }
    }
    void InsertAtFirst(int element)
    {
        Node temp = new Node(element);
        temp.next = head;
        head = temp;
    }
    void InsertAtLast(int element)
    {
        Node temp = new Node(element);
        if (head == null) {
            head = temp;
        }
        else
        {
            Node currNode = head;
            while (currNode.next !=null) {
                currNode = currNode.next;
            }
            currNode.next = temp;
            temp.next = null;
        }

    }
    void InsertAtPosition(int element, int position)
    {
        if(position == 0)
        {
            InsertAtFirst(element);
        }
        else
        {
            Node temp = new Node(element);
            if (head!=null) {
                int i =0;
                Node curr = head;
                while (i < position - 1) {
                    curr = curr.next;
                    i++;
                }
                temp.next = curr.next;
                curr.next = temp;
            }
        }
    }

    void RemoveLast()
    {
        if (head.next == null) {
            
            head = null;
        }
        else if(head.next.next !=null)
        {
            Node currNode = head;
            while (currNode.next.next != null) {
                currNode = currNode.next;
            }
            currNode.next = null;
        }
    }
    void RemoveFirst()
    {
        if (head.next == null) {
            head = null;
        }
        else if(head.next.next != null)
        {
            head = head.next;
        }
    }
}
public class SinglyLinkedList {
    public static void main(String[] args) {
        Linked ll = new Linked();

        
        ll.Insert(10);
        ll.Insert(20);
        ll.Insert(30);
        ll.Insert(40);
        ll.traverseList();
        System.out.println();
        // ll.InsertAtFirst(100);
        // ll.traverseList();
        // ll.InsertAtPosition(50, 2);
        // ll.traverseList();
        // ll.InsertAtPosition(800, 0);
        // ll.traverseList();
        // ll.InsertAtLast(90);
        // ll.traverseList();
        // ll.RemoveLast();
        // ll.traverseList();
        ll.RemoveFirst();
        ll.traverseList();
    }   
}
