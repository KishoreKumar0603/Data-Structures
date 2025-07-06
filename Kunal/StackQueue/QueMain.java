package Kunal.StackQueue;

public class QueMain{
    public static void main(String[] args) throws Exception {

        // Queue
//        CustomQueue que = new CustomQueue();
//        que.insert(10);
//        que.insert(11);
//        que.insert(12);
//        que.insert(13);
//        que.insert(14);
//        que.display();
//        que.remove();
//        que.front();
//        que.display();
//        System.out.println(que.end);

        // Circular Queue
        CircularQueue cQue = new CircularQueue(5);
        cQue.insert(3);
        cQue.insert(6);
        cQue.insert(5);
        cQue.insert(19);
        cQue.insert(1);
        cQue.display();
        cQue.remove();
        cQue.insert(133);
        cQue.display();

        System.out.println("Front : "+ cQue.front + " Rear : "+ cQue.rear);
    }
}
