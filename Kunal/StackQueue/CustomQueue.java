package Kunal.StackQueue;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;


    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        data = new int[size];
    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public void insert(int val){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }

        data[end++] = val;
    }

    public void remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }

        int val = data[0];
        for(int i = 1; i < end; i++){
            data[i - 1] = data[i];
        }
        end--;
        System.out.println(val);
    }

    public void front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        System.out.println(data[0]);
    }


    public void display(){
        for(int i = 0; i < end; i++){
            System.out.print(data[i] +" > ");
        }
        System.out.println("End");
    }

}
