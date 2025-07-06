package Kunal.StackQueue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int front = 0;
    protected int rear = 0;
    private int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void insert(int val) throws Exception{
        if (isFull()){
            throw new Exception("Queue is Full");
        }
        data[rear++] = val;
        rear = rear % data.length;
        size++;
    }


    public void remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        System.out.println(removed);
    }

    public void front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }

        System.out.println(data[front]);
    }

    public void display(){
       if(isEmpty()){
           System.out.println("Queue is Empty");
           return;
       }

       int i =  front;

       do{
           System.out.print(data[i]+" -> ");
           i++;
           i = i % data.length;
       }while (i != rear);

       System.out.println("End");
    }
}

