import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    void testRoll() {
        Dice dice = new Dice();
        dice.roll();
        assertTrue(dice.getDie1() >= 1 && dice.getDie1() <= 6, "Die 1 is out of range");
        assertTrue(dice.getDie2() >= 1 && dice.getDie2() <= 6, "Die 2 is out of range");
    }

    @Test
    void testIsDouble() {
        Dice dice = new Dice();
        dice.roll();
        boolean isDouble = dice.isDouble();
        if (dice.getDie1() == dice.getDie2()) {
            assertTrue(isDouble, "Expected a double but got false");
        } else {
            assertFalse(isDouble, "Expected not a double but got true");
        }
    }

    @Test
    void testGetDie1() {
        Dice dice = new Dice();
        dice.roll();
        assertTrue(dice.getDie1() >= 1 && dice.getDie1() <= 6, "Die 1 is out of range");
    }

    @Test
    void testGetDie2() {
        Dice dice = new Dice();
        dice.roll();
        assertTrue(dice.getDie2() >= 1 && dice.getDie2() <= 6, "Die 2 is out of range");
    }

    @Test
    void testPrintDice() {
        Dice dice = new Dice();
        dice.roll();
        dice.printDice();
    }
}