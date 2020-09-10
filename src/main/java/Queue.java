/**
 * add from last place
 * remove from first place
 *
 * First in First Out
 */
public interface Queue {

    void enqueue(int n);

    int dequeue();

    /*
     * example
     *
     * queue.enqueue(1) [1]
     * queue.enqueue(2) [1,2]
     * queue.enqueue(3) [1,2,3]
     * queue.enqueue(4) [1,2,3,4]
     *
     * queue.dequeue() = 1 [2,3,4]
     * queue.dequeue() = 2 [3,4]
     * queue.dequeue() = 3 [4]
     * queue.dequeue() = 4
     *
     */
}
