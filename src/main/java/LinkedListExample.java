/**
 * holds singular data
 */
class Node <T>{
    T value;
    Node<T> next;

    public Node(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}

class LinkedList <T> {
    Node<T> head;
    int size = 0;

    public void add(T value) {
        if (size == 0) {
            head = new Node<>(value);
        } else {
            Node<T> node = this.get(size - 1);
            node.next = new Node<>(value);
        }
        size++;
    }

    public Node<T> get(int n) {
        Node<T> node = head;
        for (int i = 0; i < n; i++) {
            node = node.next;
        }
        return node;
    }
}

public class LinkedListExample {


    public static void main(String[] args) {
        LinkedList<Person> personList = new LinkedList<>();
        personList.add(new Person("Kshitij" ,23));
        personList.add(new Person("Anjal", 23));
        System.out.println(personList.get(0));
        System.out.println(personList.get(1));
        // todo implement A doubly linked list
    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}