import java.util.ArrayList;
import java.util.List;

/**
 * holds singular data
 */
class Node <T> {
    T value;
    Node next;

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

class LinkedList <T>{
    Node<T> head;
    int size = 0;

    public void add(T value) {
        size++;
        if (head == null) {
            head = new Node();
            head.value = value; //assing head to new node
        } else {
            Node next = new Node(); //create new node
            next.value = value;
            Node lastNode = this.get(size); //get last element
            lastNode.next = next; //assign next of last node to new node
        }
    }

    public Node<T> get(int index) {
        Node<T> temp = head;
        for (int i = 0; i < index - 2; i++) {
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

        // todo implement A doubly linked list
    }
}
