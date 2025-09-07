package ThreadTypes_02.Type2;

public class TestRunnable {
    public static void main(String[] args) {
        printTask p1 = new printTask('@');
        printTask p2 = new printTask('$');
        printTask p3 = new printTask('*');

        Thread t1 = new Thread(p1);  // object banayeye thread ka aur usme pass kr dijiye runnable ka construction
        /*
        1. printTask p1 naam ka jo runnable h iske around ek thread t1 thread bna do
        2. runnable pr thread ke object ka wrapper lga dijiye.
        */

        t1.start(); // ab t1 ek thread bnega jo p1 task ke run method ke pass jayega aur us  ko complete krega

        Thread t2 = new Thread(p2);
        t2  .start();

        Thread t3 = new Thread(p3 );
        t3.start();
    }
}
