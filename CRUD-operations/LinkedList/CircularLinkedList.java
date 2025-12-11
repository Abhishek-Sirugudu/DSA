class CircularLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
        }
    }

    public Node addToEmpty(Node last, int val) {
        if (last != null) {
            return last;
        }
        Node newNode = new Node(val);
        last = newNode;
        newNode.next = last;
        return last;
    }

    public Node addstart(Node last, int val) {
        if (last == null) {
            return addToEmpty(last, val);
        }
        Node newNode = new Node(val);
        newNode.next = last.next;
        last.next = newNode;
        return last;
    }

    public Node addlast(Node last, int val) {
        if (last == null) {
            return addToEmpty(last, val);
        }
        Node newNode = new Node(val);
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
        return last;
    }

    public Node addAfter(Node last, int val, int indx) {
        if (last == null) {
            return addToEmpty(last, val);
        }
        Node newNode = new Node(val);
        Node temp = last.next;
        int i = 0;

        while (i < indx - 1) {
            temp = temp.next;
            i++;
            if (temp == last.next) return last; 
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if (temp == last) {
            last = newNode;
        }
        return last;
    }

    public Node delfirst(Node last) {
        if (last == null) {
            return null;
        }
        if (last.next == last) {
            return null;
        }
        last.next = last.next.next;
        return last;
    }

    public Node dellast(Node last) {
        if (last == null) {
            return null;
        }
        if (last.next == last) {
            return null;
        }
        Node temp = last.next;
        while (temp.next != last) {
            temp = temp.next;
        }
        temp.next = last.next;
        last = temp;
        return last;
    }

    public Node deleteNode(Node last, int key) {
        if (last == null) {
            return null;
        }
        if (last.data == key && last.next == last) {
            return null;
        }
        if (last.next.data == key) {
            last.next = last.next.next;
            return last;
        }

        Node curr = last.next;
        Node prev = last;

        do {
            if (curr.data == key) {
                prev.next = curr.next;
                if (curr == last) {
                    last = prev;
                }
                return last;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != last.next);

        return last;
    }

    public void display(Node last) {
        if (last == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = last.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        Node last = null;

        last = cll.addToEmpty(last, 10);
        cll.display(last);

        last = cll.addstart(last, 5);
        cll.display(last);

        last = cll.addlast(last, 20);
        cll.display(last); 

        last = cll.addAfter(last, 15, 2); 
        cll.display(last);

        last = cll.delfirst(last);
        cll.display(last);

        last = cll.dellast(last);
        cll.display(last);

        last = cll.addlast(last, 30);
        last = cll.addlast(last, 40);
        cll.display(last);

        last = cll.deleteNode(last, 30);
        cll.display(last);
    }
}