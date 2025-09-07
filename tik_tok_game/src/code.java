import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("i = ");
        int row = sc.nextInt();
        System.out.print("j = ");
        int column = sc.nextInt();
        char[][] myBox = new char[row][column];

        System.out.print("Player 1 choose either X or 0: ");
        char Player1 = sc.next().charAt(0);
        System.out.print("Player 2 choose either X or 0: ");
        char Player2 = sc.next().charAt(0);

        for (int i = 1; i < myBox.length; i++) {
            if (i % 2 == 1) {
                System.out.println("Player 1:");
                System.out.println("Give the position: ");
                System.out.print("i = ");
                int i1 = sc.nextInt();
                System.out.print("j = ");
                int j1 = sc.nextInt();
                System.out.print("myBox" + "[" + i1 + "]" + "[" + j1 + "]" + " = ");
                System.out.println(myBox[i1][j1] = Player1);

                if (i>4) {
                    // Win Case 1
                    for (int j = 0; j < 3; j++) {
                        for (int k = 0; k < 3; k++) {
                            if (j == k && myBox[j][k] == Player1) {
                                System.out.print(" ");
                            }
                        }
                    }
                    System.out.println("Player 1 win the match");

                    // Win Case 2
                    for (int j = 0; j < 3; j++) {
                        for (int k = 0; k < 3; k++) {
                            if (j == k && myBox[j][k] == Player2) {
                                System.out.print(" ");
                            }
                        }
                    }
                    System.out.println("Player 2 win the match");


                    // Win Case 3
                    for (int j = 0; j < 3; j++) {
                        for (int k = 0; k < 3; k++) {
                            if (j + k == 2 && myBox[j][k] == Player1) {
                                System.out.print(" ");
                            }
                        }
                    }
                    System.out.println("Player 1 win the match");



                    // Win Case 4
                    for (int j = 0; j < 3; j++) {
                        for (int k = 0; k < 3; k++) {
                            if (j + k == 2 && myBox[j][k] == Player2) {
                                System.out.print(" ");
                            }
                        }
                    }
                    System.out.println("Player 2 win the match");



                    // Win Case 5
                    int num1 = 0;
                    for (int j = 0; j < 3; j++) {
                        if (myBox[num1][j] == Player1) {
                            System.out.println();
                        }else if (myBox[j][num1] == Player1) {
                            System.out.println();
                        }
                    }
                    System.out.println("Player 1 win the match");



                    // Win Case 6
                    int num2 = 0;
                    for (int j = 0; j < 3; j++) {
                        if (myBox[num2][j] == Player2) {
                            System.out.println();
                        }else if (myBox[j][num2] == Player2) {
                            System.out.println();
                        }
                    }
                    System.out.println("Player 2 win the match");



                    // Win Case 7
                    int num3 = 1;
                    for (int j = 0; j < 3; j++) {
                        if (myBox[num3][j] == Player1){
                            System.out.println();
                        }else if (myBox[j][num3] == Player1){
                            System.out.println();
                        }
                    }
                    System.out.println("Player 1 win the match");



                    // Win Case 8
                    int num4 = 1;
                    for (int j = 0; j < 3; j++) {
                        if (myBox[num4][j] == Player2){
                            System.out.println();
                        }else if (myBox[j][num4] == Player2){
                            System.out.println();
                        }
                    }
                    System.out.println("Player 2 win the match");



                    // Win Case 9
                    int num5 = 2;
                    for (int j = 0; j < 3; j++) {
                        if (myBox[num5][j] == Player1){
                            System.out.println();
                        } else if (myBox[j][num5] == Player1){
                            System.out.println();
                        }

                    }
                    System.out.println("Player 1 win the match");



                    // Win Case 10
                    int num6 = 2;
                    for (int j = 0; j < 3; j++) {
                        if (myBox[num6][j] == Player2){
                            System.out.println();
                        } else if (myBox[j][num6] == Player2) {
                            System.out.println();
                        }
                    }
                    System.out.println("Player 2 win the match");
                }
            } else {
                System.out.println("Player 2:");
                System.out.println("Give the position: ");
                System.out.print("i = ");
                int i2 = sc.nextInt();
                System.out.print("j = ");
                int j2 = sc.nextInt();
                System.out.print("myBox" + "[" + i2 + "]" + "[" + j2 + "]" + " = ");
                System.out.println(myBox[i2][j2] = Player2);

                if (i>4) {
                    // Win Case 1
                    for (int j = 0; j < 3; j++) {
                        for (int k = 0; k < 3; k++) {
                            if (j == k && myBox[j][k] == Player1) {
                                System.out.print(" ");
                            }
                        }
                    }
                    System.out.println("Player 1 win the match");

                    // Win Case 2
                    for (int j = 0; j < 3; j++) {
                        for (int k = 0; k < 3; k++) {
                            if (j == k && myBox[j][k] == Player2) {
                                System.out.print(" ");
                            }
                        }
                    }
                    System.out.println("Player 2 win the match");


                    // Win Case 3
                    for (int j = 0; j < 3; j++) {
                        for (int k = 0; k < 3; k++) {
                            if (j + k == 2 && myBox[j][k] == Player1) {
                                System.out.print(" ");
                            }
                        }
                    }
                    System.out.println("Player 1 win the match");



                    // Win Case 4
                    for (int j = 0; j < 3; j++) {
                        for (int k = 0; k < 3; k++) {
                            if (j + k == 2 && myBox[j][k] == Player2) {
                                System.out.print(" ");
                            }
                        }
                    }
                    System.out.println("Player 2 win the match");



                    // Win Case 5
                    int num1 = 0;
                    for (int j = 0; j < 3; j++) {
                        if (myBox[num1][j] == Player1) {
                            System.out.println();
                        }else if (myBox[j][num1] == Player1) {
                            System.out.println();
                        }
                    }
                    System.out.println("Player 1 win the match");



                    // Win Case 6
                    int num2 = 0;
                    for (int j = 0; j < 3; j++) {
                        if (myBox[num2][j] == Player2) {
                            System.out.println();
                        }else if (myBox[j][num2] == Player2) {
                            System.out.println();
                        }
                    }
                    System.out.println("Player 2 win the match");



                    // Win Case 7
                    int num3 = 1;
                    for (int j = 0; j < 3; j++) {
                        if (myBox[num3][j] == Player1){
                            System.out.println();
                        }else if (myBox[j][num3] == Player1){
                            System.out.println();
                        }
                    }
                    System.out.println("Player 1 win the match");



                    // Win Case 8
                    int num4 = 1;
                    for (int j = 0; j < 3; j++) {
                        if (myBox[num4][j] == Player2){
                            System.out.println();
                        }else if (myBox[j][num4] == Player2){
                            System.out.println();
                        }
                    }
                    System.out.println("Player 2 win the match");



                    // Win Case 9
                    int num5 = 2;
                    for (int j = 0; j < 3; j++) {
                        if (myBox[num5][j] == Player1){
                            System.out.println();
                        } else if (myBox[j][num5] == Player1){
                            System.out.println();
                        }

                    }
                    System.out.println("Player 1 win the match");



                    // Win Case 10
                    int num6 = 2;
                    for (int j = 0; j < 3; j++) {
                        if (myBox[num6][j] == Player2){
                            System.out.println();
                        } else if (myBox[j][num6] == Player2) {
                            System.out.println();
                        }
                    }
                    System.out.println("Player 2 win the match");
                }
            }
        }



        }
    }

