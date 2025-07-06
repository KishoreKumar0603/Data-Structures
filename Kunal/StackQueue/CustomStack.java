package Kunal.StackQueue;

public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int top = -1;

    public  CustomStack(){
        this(DEFAULT_SIZE );
    }


    public CustomStack(int size){
        this.data = new int[size];
    }

    public void push(int val) throws StackException{
        if(isFull()){
            throw new StackException("Stack is Full");
        }

        top++;
        this.data[top] = val;
    }


    public int pop() throws StackException{
        if (isEmpty()){
            throw new StackException("Stack is Empty");
        }
        return this.data[top--];
    }


    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is empty");
        }
        return data[top];
    }


    public boolean isEmpty(){
        return top == -1;
    }


    public boolean isFull(){
        return top == data.length - 1;
    }
}
