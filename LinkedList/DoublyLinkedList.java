public class DoublyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public Node head;
    public Node tail;

    public void addFirst(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void addLast(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public int removeFirst(){
        if(head == null){
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }
        if(head == tail){
            int value = head.data;
            head = tail = null;
            return value;
        }
        int value = head.data;
        head = head.next;
        head.prev = null;
        return value;
    }
    public int removeLast(){
        if(head == null){
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }
        if(head == tail){
            int value = head.data;
            head = tail = null;
            return value;
        }
        int value = tail.data;
        tail = tail.prev;
        tail.next = null;
        return value;
    }
}
