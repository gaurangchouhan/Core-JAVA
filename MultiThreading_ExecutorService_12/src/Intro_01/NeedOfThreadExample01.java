package Intro_01;

public class NeedOfThreadExample01 {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        System.out.println("Starting Time: "+startTime);

        // First Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d@ ", i);
        }
        System.out.println("\n @ task complete");

        // Second Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.println("\n $ task complete");


        // Third Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.println("\n * task complete");

        long endTime = System.currentTimeMillis();
        System.out.println(endTime);

        System.out.printf("Time taken: %d", (endTime-startTime));
    }
}
