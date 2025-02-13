public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int count = 0;

        System.out.println("Rolling the dice...");

        do {
            dice.roll();
            dice.printDice();
            count++;
            if (!dice.isDouble()) {
                System.out.println("Try again.");
            }
        } while (!dice.isDouble());

        System.out.println("You rolled a double!");
        System.out.println("It took " + count + " rolls to get a double.");
    }
}