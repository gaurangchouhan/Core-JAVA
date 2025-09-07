package Exercise16OverloadOverride;

public class problem85Overloading {

    public int sum(int a, int b){
        return a+b;
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }

    public double sum(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        problem85Overloading call = new problem85Overloading();
        double add = call.sum(1.23, 43.23);
        System.out.println(add);
    }
}
