import java.util.Arrays;
interface StackExample {
    void push(int n);
    int pop();
}
class StackExampleImpl implements StackExample{
    private int size=0;
    private Object elements[];
    @Override
    public void push(int n) {
        if (size == elements.length) {
            capacity();
        }
        elements[size++] = n;
    }
    @Override
    public int pop() {
        int n = (int) elements[--size];
        elements[size] = null;
        return n;
    }
    private void capacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for(int i = 0; i < size ;i++) {
            sb.append(elements[i].toString());
            if(i < size-1){
                sb.append(",");
            }
        }
        sb.append(']');
        return sb.toString();
    }
    public static void main(String[] args)
    {
        StackExampleImpl stack = new StackExampleImpl();
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
}