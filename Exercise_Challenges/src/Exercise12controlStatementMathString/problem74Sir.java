package Exercise12controlStatementMathString;

import java.util.Scanner;

class problem74Sir {
    int random;

    problem74Sir(){
        random = (int)(Math.ceil(Math.random()*100));
    }

    int guess(int guessNum){
        return guessNum - random;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        problem74Sir game = new problem74Sir();
        int guessNum;
        int result;
        do {
            System.out.print("User! Guess the number: ");
            int num = sc.nextInt();
            result = game.guess(num);
            if (result == 0){
                System.out. println("Congrats, your guess is correct");
            } else if (result < 0  ) {
                System.out.println("Please Guess Higher");
            }else {
                System.out. println("Please Guess Lower");
            }
        }while (result != 0);

    }
}
