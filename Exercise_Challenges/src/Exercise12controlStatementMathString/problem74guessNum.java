package Exercise12controlStatementMathString;

import java.util.Scanner;

class guessNum {

    int guess(){
        return (int)(Math.random() * 100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        guessNum num = new guessNum();
        int guessNum = num.guess();
        int userNum;
        do {
            System.out.print("User guess the number: ");
            userNum = sc.nextInt();
            System.out.println(guessNum);
        }while (userNum != guessNum);
        System.out.println("User guess the right number");




    }
}
