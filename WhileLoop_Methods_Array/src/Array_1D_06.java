import java.util.Scanner;

public class Array_1D_06 {
    public static void main(String[] args) {
//        int[] marks = new int[5];
//        marks[0] = 34;
//        marks[1] = 57;
//        marks[2] = 25;
//        marks[3] = 73;
//        marks[4] = 78;
//        int[] marks = {23, 56, 78, 87, 67};


//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

        // Array Traversal
        /*
        int index = 0;
        while (index< marks.length){
            System.out.println(marks[index]);
            index++;
        }
         */

        int[] num = {12, 34, 56, 75, 45, 22, 54, 55, 1, 24, 41};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int newNum = sc.nextInt();

        boolean isNumExist = isNumExist(num, newNum);
        if (isNumExist){
            System.out.println("Your number exists");
        }else {
            System.out.println("Your number does not  exist");
        }
    }

    public static boolean isNumExist(int[] num, int newNum ){
        int index = 0;
        while (index < num.length){
            if(num[index] == newNum){
                System.out.println(index);
                return true;
            }
            index++;
        }
        return false;
    }
}
