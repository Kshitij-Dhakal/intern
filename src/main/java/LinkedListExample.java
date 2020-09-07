/**
 * holds singular data
 */
class Node {
    int value;
    Node next;

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

class LinkedList {
    Node head;
    int size = 0;

    public void add(int value) {
        size++;
        if (head == null) {
            head = new Node();
            head.value = value; //assing head to new node
        } else {
            Node next = new Node(); //create new node
            next.setValue(value);
            Node lastNode = this.get(size); //get last element
            lastNode.next = next; //assign next of last node to new node
        }
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
}

public class LinkedListExample {


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        // todo implement A doubly linked list
    }
}
