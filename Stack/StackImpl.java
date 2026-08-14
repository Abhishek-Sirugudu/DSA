package Stack;

public class StackImpl {
    public int[] stack;
    public int top;
    public int capacity;

    StackImpl(int capacity){
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    public void push(int data){
        if(top == capacity-1){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stack[top] = data;
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        int last = stack[top];
        top--;
        return last;
    }

    public int peek(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void display(){
        if(top == -1){
            System.out.println("stack is Empty");
            return;
        }

        for(int i = top ; i >= 0; i--){
            System.out.println("["+stack[i]+"]");
        }
    }
}
