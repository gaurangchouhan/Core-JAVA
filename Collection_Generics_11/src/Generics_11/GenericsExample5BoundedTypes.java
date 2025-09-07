package Generics_11;

class BoundedTypes <T extends Number> {
    T[] num;

    BoundedTypes(T[] num) {
        this.num = num;
    }

    double average(){
        double sum = 0;
        for (T t : num) {
            sum += t.doubleValue();
        }
        return sum/num.length;
    }

    public static void main(String[] args) {
        Integer[] intEx = {10, 20, 30, 40};
        BoundedTypes<Integer> stat1 = new BoundedTypes<>(intEx);
        System.out.println("Average integer: " + stat1.average());

        Double[] douEx = {1.5, 2.5, 3.5};
        BoundedTypes<Double> stat2 = new BoundedTypes<>(douEx);
        System.out.println("Average double: " + stat2.average());


    }
}
