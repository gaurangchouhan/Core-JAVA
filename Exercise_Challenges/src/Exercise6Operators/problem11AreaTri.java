package Exercise6Operators;

import java.util.Scanner;

public class problem11AreaTri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. B = ");
        int B = input.nextInt();
        System.out.print("Enter no. H = ");
        int H = input.nextInt();

        double AreaOfTriangle = 0.5*B*H;
        System.out.println("Area of Triangle = " + AreaOfTriangle);
    }
}
