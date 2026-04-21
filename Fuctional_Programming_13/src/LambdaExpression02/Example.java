package LambdaExpression02;

public class Example {
    public static void main(String[] args) {
        Example test = new Example();

//         (a, b) -> a+b
//         toPrint -> System.out.println("Java course");
//         (a, b) -> {
//                    int sum = a+b;
//                    System.out.println(sum);
//                    }
    }

    private int add(int a, int b){
        int sum = a+b;
        return sum;
    }

    private void print(String toPrint){
        System.out.println(toPrint);
    }
}
