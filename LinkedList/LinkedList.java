package LinkedList;

public class LinkedList {
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public void insertAtHead(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void insertAtTail(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void delHead(){
        if(head == null){
            System.out.println("Linked List is Empty");
            return;
        }
        head = head.next;
    }

    public void delAtTail(){
        if(head == null){
            System.out.println("Linked List is Empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteByValue(int value){
        if(head == null){
            System.out.println("Linked list is Empty");
            return;
        }

        if(head.data == value){
            delHead();
            return;
        }

        if(head.next == null){
            System.out.println(" Value Not found ");
            return;
        }
        Node temp = head;

        while(temp.next != null){
            if(temp.next.data == value){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }
    public int length(){
        int length = 0;

        Node temp = head;

        while(temp != null){
            temp = temp.next;
            length++;
        }
        return length;
    }

    public boolean search(int value){
        if(head == null){
            System.out.println("Linked List is Empty");
            return false;
        }
        Node temp = head;
        while(temp != null){
            if(temp.data == value){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void reverse(){
        Node cur = head;
        Node prev = null;
        Node next;

        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

    }
    public int findMiddle(){
        if(head == null){
            return -1;
        }

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    public boolean hasCycle(){
        if(head == null){
            return false;
        }
        Node slow = head,fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }


}
