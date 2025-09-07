package Exercise14InheritanceEqualsHashNested.problem82;

public class ArrayOperations {

    private int[] number;

    public ArrayOperations(int[] number) {
        this.number = number;
    }

    public class Statistics{
        double mean(){
            double sum = 0;
            for (int number : number) {
                sum += number;
            }
            return sum / number.length;
        }

        double medium(){
             return 0;
        }
    }
}
