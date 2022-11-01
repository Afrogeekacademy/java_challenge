package de.geek237.library.java_challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChallengeTest {

    Challenge challenge;

    @Before
    public  void before()  {
        challenge = new ChallengeImp();
    }

    @Test
    public void opposite() {
        assertEquals(challenge.opposite(1), -1);
        assertEquals(challenge.opposite(14), -14);
        assertEquals(challenge.opposite(-34), 34);
        assertEquals(challenge.opposite(0), 0);
    }

    @Test
    public void basicMath() {
        assertEquals(challenge.basicMath("+", 2, 4), 6);
    }

    @Test
    public void getSum() {
        assertEquals(challenge.GetSum(0, 1), 1);
    }

    @Test
    public void multiply() {
        assertEquals(challenge.multiply(5.0, 5.0), 25.0, 0);
    }

    @Test
    public void toJadenCase() {
        assertEquals(challenge.toJadenCase("ich liebe Java."), "Ich Liebe Java.");
        assertEquals(challenge.toJadenCase("yvanna ist eine Freundin von mir!"), "Yvanna Ist Eine Freundin Von Mir!");
    }

    @Test
    public void stringToNumber() {
        assertEquals(challenge.stringToNumber("17"), 17);
        assertEquals(challenge.stringToNumber("-17"), -17);
        assertEquals(challenge.stringToNumber("0"), 0);
    }

    @Test
    public void countSheeps() {
        assertEquals(challenge.countSheeps(new Boolean[]{true, true, false, true}), 3);
    }

    @Test
    public void greet() {
        assertEquals(challenge.greet(), "hello world!");
    }

    @Test
    public void disemvowel() {
        assertEquals(challenge.disemvowel("Ich liebe Java."), "ch lb Jv.");
        assertEquals(challenge.disemvowel("Yvanna ist eine Freundin von mir!"), "Yvnn st n Frndn vn mr!");
    }

    @Test
    public void even_or_odd() {
        assertEquals(challenge.even_or_odd(2), "Even");
        assertEquals(challenge.even_or_odd(3), "Odd");
        assertEquals(challenge.even_or_odd(0), "Even");
    }
}
