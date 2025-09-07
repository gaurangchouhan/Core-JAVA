package Exercise12controlStatementMathString;

class dicePlay {
    int roll(){
        double dice = Math.random() * 6;
        return (int) Math.ceil(dice);
    }
    public static void main(String[] args) {
        dicePlay dice = new dicePlay();
        for (int i = 0; i < 10; i++) {
            System.out.println(dice.roll());
        }
    }
}
