package Exercise14InheritanceEqualsHashNested.problem82;

public class TestArr {
    public static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(new int[]{1, 2, 3, 4, 5  });

        ArrayOperations.Statistics statistics = opr.new Statistics();   // it is used to access nested class
        System.out.println(statistics.mean());
    }
}
