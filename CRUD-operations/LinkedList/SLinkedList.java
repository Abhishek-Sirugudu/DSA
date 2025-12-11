public class SLinkedList {
    //Node Creation
    public class Node{
        int data;
        Node next;

        Node(int val){
            this.data = val;
            this.next = null;
        }
    }
    public Node head;
    public Node tail;

    public void insertBegin(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void insertEnd(int val){
        Node newNode = new Node(val);

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void insertAtSpecific(int val,int indx){
        Node newNode = new Node(val);

        if(indx == 0){
            insertBegin(val);
            return;
        }

        int i = 0;
        Node temp = head;
        
        while(i < indx-1 && temp.next != null){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if(newNode.next ==null){
            tail =newNode;

        }
    }

    public int delFirst(){
        
        if(head == null){
            return Integer.MIN_VALUE;
        }
        if(head.next == null){
            int val = head.data;
            head = tail = null;
            return val;
        }

        int val = head.data;

        head = head.next;
        return val;
    }

    public int delLast(){
        if(head == null){
            return Integer.MIN_VALUE;
        }
        if(head.next == null){
            int val = head.data;
            head = tail = null;    
            return val;
        }
        int val = tail.data;

        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return val;
    }

    public int delSpecificIndex(int indx){
        if(indx == 0){
            return delFirst();
            
        }
        if(head == null){
            return Integer.MIN_VALUE;
        }

        Node temp = head;
        int i = 0;

        while(i < indx-1 && temp.next != null){
            i++;
            temp = temp.next;
        }
        int value = temp.next.data;
        temp.next = temp.next.next;
        if(temp.next == null){
            tail = temp;
        }
        return value;

    
    }

    public void display(){
        if(head == null){
            System.out.println("Linked List is Empty!");
            return;
        }

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void update(int val,int indx){
        if(head == null){
            System.out.println("Linked List is Empty");
            return;
        }
        int i = 0;
        Node temp = head;

        while(i < indx){
            if(temp == null)return;
            temp = temp.next;
            i++;
        }

        temp.data = val;
    }

}
