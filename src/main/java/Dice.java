public class Dice {

    int die1;
    int die2;

    public void roll() {
        die1 = (int)(Math.random() * 6) + 1;
        die2 = (int)(Math.random() * 6) + 1;
    }

    public boolean isDouble() {
        return die1 == die2;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public void printDice() {
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
    }
}