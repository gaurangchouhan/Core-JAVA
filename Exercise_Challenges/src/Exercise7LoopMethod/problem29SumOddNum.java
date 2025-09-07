package Exercise7LoopMethod;

public class problem29SumOddNum {
    public static void main(String[] args) {

        int N = 1;
        while (N < 11){
            if (N%2 != 0){
                System.out.println(N+1);
            }else {
                System.out.println("Even Number: " + N);
            }
            N++;
        }
    }
}
