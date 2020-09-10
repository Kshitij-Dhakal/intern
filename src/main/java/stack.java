import java.util.Stack;

public class stack{

    static void push(Stack stack, int n){
        stack.push(new Integer(n));
        System.out.println("pushing >> " +n+ " on a stack");
        System.out.println(stack);
    }
    static void pop(Stack stack){
        System.out.print("popping >> ");
        Integer n =(Integer)stack.pop();
        System.out.println(n + " of a stack");
        System.out.println(stack);
    }

    public static void main(String[] args) {
     Stack stack = new Stack();
     System.out.println("stack" +stack);
        push(stack,1);
        push(stack,2);
        push(stack,3);
        push(stack,4);
        pop(stack);
        pop(stack);
        pop(stack);
        pop(stack);
    }
}