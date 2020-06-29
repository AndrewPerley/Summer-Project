package edu.ahs.robotics.java;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayListUtilitiesTest {


    @Test
    public void testArrayList() {

        ArrayList<String> myList = new ArrayList<>();
        myList.add("hello");
        myList.add("heat");
        myList.add("heart");
        for (int i = 0; i < myList.size(); i++) {
            String message = myList.get(i);
            System.out.println(message);
        }



    }


    @Test
    public void searchArrayList() {

        ArrayList<String> arraySearch = new ArrayList<>();
        arraySearch.add("hi");
        arraySearch.add("chive");
        arraySearch.add("bye");
        String target = ("hi");

            assertTrue(ArrayListUtilities.searchArrayList(target,arraySearch));
    }

    @Test
    public void integerArrayList() {

        ArrayList<Integer> arrayListInteger = new ArrayList<>();
        arrayListInteger.add(5);
        arrayListInteger.add(6);
        arrayListInteger.add(7);
        Integer highestNumber = ;



    }
}


