public class forEachLoop_03 {
    public static void main(String[] args) {
        int[] array = new int[]{
           1, 4, 9, 16, 25, 36, 49, 64, 81, 100
        };
        printArray(array);
    }

    public static void printArray(int[] array){
        for (int number : array){
            System.out.print(number + "  ");
        }
    }
}
