import java.util.LinkedList;
import java.util.Queue;

public class Queue_Interface_5 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(12);
        queue.add(3);
        queue.offer(7);

        System.out.println(queue.element());
        System.out.println(queue.peek());

        System.out.println(queue.remove())  ;
        Utility.print1(queue);

        System.out.println(queue.poll());
         Utility.print1(queue);

         System.out.println(queue.remove());
         Utility.print1(queue);

         System.out.println(queue.poll());





    }
}
