class implementation {
    public Node tail;
    public Node head;

    public class Node {
        int data;
        Node next;

        public Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    public void addFirst(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addAnywhere(int val, int indx) {
        int i = 0;
        Node temp = head;
        Node newNode = new Node(val);
        if (indx == 0) {
            addFirst(val);
            return;
        }

        while (i < indx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.print("null");
    }

    public void delFirst() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        head = head.next;

        if(head == null){
            tail = null;
        }
    }

    public void delLast() {
        if (tail == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        if (head.next == null) {
            tail = head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
    }
    public static void main(String[] args) {
        implementation ll = new implementation();
        ll.addFirst(10);
        ll.addLast(20);
        ll.addAnywhere(15, 1);
        ll.display(); // Expected: 10 -> 15 -> 20 -> null
    }

}