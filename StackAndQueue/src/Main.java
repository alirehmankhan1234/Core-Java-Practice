import java.util.PriorityQueue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stk = new Stack<Integer>();

        System.out.println(" Stack Size: "+stk.size());

        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);

        System.out.println(" Stack Size: "+stk.size());

        System.out.println(" Top Value of Stack : "+stk.peek());

        System.out.println(" Pop Value of Stack : "+stk.pop());

        System.out.println(" Stack Size: "+stk.size());

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        System.out.println(" Size of Queue: "+queue.size());

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println(queue);

        System.out.println(queue.size());

        System.out.println(queue.peek());

        System.out.println(queue.poll());

        System.out.println(queue.size());

        System.out.println(queue.isEmpty());

    }
}