package Queue;

public class QueueImpl {

    private int[] queue;
    private int size;
    private  int front;
    private  int capacity;
    private int rear ;

    public QueueImpl(int capacity){
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int data){
        if(size == capacity){
            System.out.println("Queue is Full");
            return;
        }

        rear = (rear +1 )% capacity;
        queue[rear] = data;
        size++;
    }

    public int dequeue(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        int val = queue[front];
        front = (front +1)% capacity;
        size--;
        return val;
    }

    public int peek(){
        if(size == 0){
            System.out.println("Q is Empty");
            return -1;
        }
        return queue[front];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void display(){
        if(size == 0){
            System.out.println("Q is Empty");
            return;
        }
        for(int i = 0 ; i < size; i++){
            System.out.print(queue[(front+i) % capacity]+" ");
        }
        System.out.println();
    }
}
