package com.shxdee.ninthtask;

import java.util.*;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class LambdaTest {

    @Test
    public void getLengthTest() {
        String s = "bananas";
        assertEquals(LambdaRunner.getFunctionResult(LambdaDemo.getLength, s), Integer.valueOf(7));
    }

    @Test
    public void getFirstCharTest() {
        String s = "bananas";
        assertEquals(LambdaRunner.getFunctionResult(LambdaDemo.getFirstChar, s), Character.valueOf('b'));
        assertEquals(LambdaRunner.getFunctionResult(LambdaDemo.getFirstChar, ""), null);
    }

    @Test
    public void countWordsTest() {
        String s = "bananas,,are, food";
        assertEquals(LambdaRunner.getFunctionResult(LambdaDemo.countWords, s), Integer.valueOf(3));
    }

    @Test
    public void isWithSpaceTestTrue() {
        String str = "what where";
        assertTrue(LambdaRunner.getPredicateResult(LambdaDemo.isWithSpace, str));
    }

    @Test
    public void isWithSpaceTestFalse() {
        String str = "whatwhere";
        assertFalse(LambdaRunner.getPredicateResult(LambdaDemo.isWithSpace, str));
    }


    @Test
    public void getAgeOfHumanTest() {
        Student s = new Student("Проскурин", "Евгений", "Юрьевич", 19, Gender.MALE, "ОмГу", "ИМИТ", "МПБ-004");
        assertEquals(LambdaRunner.getFunctionResult(LambdaDemo.getAgeOfHuman, s), Integer.valueOf(19));
    }

    @Test
    public void getFullNameTest() {
        Student s = new Student("Проскурин", "Евгений", "Юрьевич", 19, Gender.MALE, "ОмГу", "ИМИТ", "МПБ-004");
        assertEquals(LambdaRunner.getFunctionResult(LambdaDemo.getFullName, s), "Проскурин Евгений Юрьевич");
    }

    @Test
    public void increaseAgeTest() {
        Human s = new Human("Проскурин", "Евгений", "Юрьевич", 19, Gender.MALE);
        Human result = new Human("Проскурин", "Евгений", "Юрьевич", 20, Gender.MALE);
        assertTrue(result.equals(LambdaRunner.getFunctionResult(LambdaDemo.increaseAge, s)));
    }

    @Test
    public void isEqualLastNameTestTrue() {
        Human h1 = new Human("Проскурин", "Евгений", "Юрьевич", 19, Gender.MALE);
        Human h2 = new Human("Проскурин", "Михаил", "Юрьевич", 10, Gender.MALE);
        assertTrue(LambdaRunner.getBiPredicateResult(LambdaDemo.isEqualLastName, h1, h2));
    }

    @Test
    public void isEqualLastNameTestFalse() {
        Human h1 = new Human("Проскурин", "Евгений", "Юрьевич", 19, Gender.MALE);
        Human h2 = new Human("Арбузов", "Дмитрий", "Олегович", 18, Gender.MALE);
        assertFalse(LambdaRunner.getBiPredicateResult(LambdaDemo.isEqualLastName, h1, h2));
    }

    @Test
    public void isYoungerThanTestTrue() {
        Human h1 = new Human("Проскурин", "Евгений", "Юрьевич", 19, Gender.MALE);
        Human h2 = new Human("Арбузов", "Дмитрий", "Олегович", 18, Gender.MALE);
        Human h3 = new Human("Телегин", "Матвей", "Александрович", 18, Gender.MALE);
        assertTrue(LambdaRunner.getLambdaInterfaceResult(LambdaDemo.isYoungerThan, h1, h2, h3, 20));
    }

    @Test
    public void isYoungerThanTestFalse() {
        Human h1 = new Human("Проскурин", "Евгений", "Юрьевич", 19, Gender.MALE);
        Human h2 = new Human("Арбузов", "Дмитрий", "Олегович", 18, Gender.MALE);
        Human h3 = new Human("Телегин", "Матвей", "Александрович", 18, Gender.MALE);
        assertFalse(LambdaRunner.getLambdaInterfaceResult(LambdaDemo.isYoungerThan, h1, h2, h3, 17));
    }
}