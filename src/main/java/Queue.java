/**
 * add from last place
 * remove from first place
 *
 * First in First Out
 */
class Queue {

    /**
     * @param args the command line arguments
     */
    int start, end, total, range,array[];

    public Queue(int range){
        this.range=range;
        start=this.total=0;
        end=range-1;
        array=new int[this.range];
    }

    void enqueue(int n){
        this.end=(this.end +1) % this.range;
        this.array[this.end]=n;
        this.total=this.total +1;
        System.out.println(n+" << is added to queue");
    }
    int dequeue(){
        int n=this.array[this.start];
        this.start=(this.start +1)%this.range;
        this.total=this.total-1;
        return n;
    }
    int start(){
        return this.array[this.start];
    }
    int end(){
        return this.array[this.end];
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Queue queue=new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println("Starting is "+queue.start());
        System.out.println("Ending is " + queue.end());
        System.out.println(queue.dequeue()+" >> is dequeued from queue");
        System.out.println(queue.dequeue()+" >> is dequeued from queue");
        System.out.println(queue.dequeue()+" >> is dequeued from queue");

        System.out.println("Starting is "+queue.start());
        System.out.println("Ending is " + queue.end());
    }
}


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

