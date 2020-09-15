import java.util.Arrays;
interface StackExample {
    void push(int n);
    int pop();

class StackExampleImpl implements StackExample{
    int start, end, total, range,array[];

    private void capacity(int range) {
        this.range=range;
        start=this.total=0;
        end=range-1;
        array=new int[this.range];
    }
    public void push(int n){
        this.end=(this.end +1) % this.range;
        this.array[this.end]=n;
        this.total=this.total +1;
    }

    public int pop() {
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
    public static void main(String[] args)
    {
        StackExample stack = new StackExampleImpl();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        System.out.println( stack.pop() );
        System.out.println( stack.pop() );
        System.out.println( stack.pop() );
        System.out.println( stack );
    }
}}