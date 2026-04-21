package JoinMethod_05;

import ThreadTypes_02.Type2.printTask;

public class joinTest {
    public static void main(String[] args) throws InterruptedException {
        printTask p1 = new printTask('@');
        printTask p2 = new printTask('$');
        printTask p3 = new printTask('*');

        Thread t1 = new Thread(p1);
        t1.start();
        System.out.println("\n Thread 1 started");

        Thread t2 = new Thread(p2);
        t2.start();
        System.out.println("\n Thread 2 started");

        t1.join();
        /*
         ye method main method ko call kr rha h ki jb tk t1 thread khtm na ho jaye
         tb tk t3 thread ho run mt krna
        */

        Thread t3 = new Thread(p3 );
        t3.start();
        System.out.println("\n Thread 3 started");

    }
}
