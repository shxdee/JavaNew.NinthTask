package com.shxdee.ninthtask;

import java.util.*;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import java.util.*;

public class StreamApiDemoTest {

    @Test
    public void deleteNullTest() {
        List<Object> list = new ArrayList<>();
        Human human = new Human("Проскурин", "Евгений", "Юрьевич", 19, Gender.MALE);
        Collections.addAll(list, human, null, null, 10, 20);
        List<Object> ext = new ArrayList<>();
        Collections.addAll(ext, human, 10, 20);
        assertEquals(StreamApiDemo.deleteNull.apply(list), ext);
    }

    @Test
    public void countPositiveTest() {
        Set<Integer> list = new HashSet<>();
        Collections.addAll(list, 23, 12, 48, -35, 0, 4374893, -12);
        assertEquals(Optional.ofNullable(StreamApiDemo.countPositive.apply(list)), Optional.of(4));
    }

    @Test
    public void getLastThreeElemTest() {
        List<Object> list = new ArrayList<>();
        Human human = new Human("Проскурин", "Евгений", "Юрьевич", 19, Gender.MALE);
        Collections.addAll(list, human, null, null, 10, 20);
        List<Object> ext = new ArrayList<>();
        Collections.addAll(ext, null, 10, 20);
        assertEquals(StreamApiDemo.getLastThreeElem.apply(list), ext);

        List<Object> ext2 = new ArrayList<>();
        Collections.addAll(ext2, 1, 2);
        assertEquals(StreamApiDemo.getLastThreeElem.apply(ext2), ext2);
    }

    @Test
    public void getFirstEvenTest() {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 5, 7, 13, 16, 34, 48, 243242342);
        assertEquals(Optional.ofNullable(StreamApiDemo.getFirstEven.apply(list)), Optional.of(16));
    }

    @Test
    public void getSquareListTest() {
        int[] list = {5, 6, 7, 10};
        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 25, 36, 49, 100);
        assertEquals(list1, (StreamApiDemo.getSquareList.apply(list)));
    }

    @Test
    public void getSortedStringListTest() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "bananas", "arbuz", "racecar", "", "amogus", null, null);

        List<String> result = new ArrayList<>();
        Collections.addAll(result, "amogus", "arbuz", "bananas", "racecar");

        assertEquals((StreamApiDemo.getSortedStringList.apply(list)), result);
    }

    @Test
    public void getSortedReversStringList() {
        Set<String> list = new HashSet<>();
        Collections.addAll(list, "bananas", "arbuz", "racecar", "amogus");

        List<String> result = new ArrayList<>();
        Collections.addAll(result, "racecar", "bananas", "arbuz", "amogus");

        assertEquals((StreamApiDemo.getSortedReversStringList.apply(list)), result);
    }

    @Test
    public void getSquareSumTest() {
        Set<Integer> list = new HashSet<>();
        Collections.addAll(list, 5, 6, 7, 10);

        assertEquals(Optional.ofNullable((StreamApiDemo.getSquareSum.apply(list))), Optional.of(25 + 36 + 49 + 100));
    }

    @Test
    public void getMaxAgeFromCollectionTest() {
        Collection<Human> list = new ArrayList<>();
        Human h1 = new Human("Проскурин", "Евгений", "Юрьевич", 19, Gender.MALE);
        Human h2 = new Human("Арбузов", "Дмитрий", "Олегович", 18, Gender.MALE);
        Human h3 = new Human("Телегин", "Матвей", "Александрович", 18, Gender.MALE);

        Collections.addAll(list, h1, h2, h3);
        assertEquals(Optional.ofNullable(StreamApiDemo.getMaxAgeFromCollection.apply(list)), Optional.of(19));
    }

    @Test
    public void sortCollectionTest() {
        Collection<Human> list = new ArrayList<>();
        Human h1 = new Human("Проскурин", "Евгений", "Юрьевич", 19, Gender.MALE);
        Human h2 = new Human("Арбузова", "Анастасия", "Олеговна", 12, Gender.FEMALE);
        Human h3 = new Human("Телегин", "Матвей", "Александрович", 18, Gender.MALE);

        Collections.addAll(list, h1, h2, h3);

        Collection<Human> list1 = new ArrayList<>();
        Collections.addAll(list1, h3, h1, h2);

        assertEquals(StreamApiDemo.sortCollection.apply(list), list1);
    }
}
