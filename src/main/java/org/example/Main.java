package org.example;

public class Main {
    public static void main(String[] args) {
        NavigationTest navigationTest = new NavigationTest();
        SecondExerciseSingleFieldButton secondExercise = new SecondExerciseSingleFieldButton();
        ThirdExerciseTwoFieldsAndOutput thirdExercise = new ThirdExerciseTwoFieldsAndOutput();

        try {
//            navigationTest.setUp();
//            navigationTest.testNavigation();
//            navigationTest.tearDown();
//
//            secondExercise.setUp();
//            secondExercise.testSecondExerciseSingleFieldButton();
//            secondExercise.tearDown();

            thirdExercise.setUp();
            thirdExercise.testSecondExerciseSingleFieldButton();
            thirdExercise.tearDown();

        } finally {
            secondExercise.tearDown();
            navigationTest.tearDown();
            thirdExercise.tearDown();
        }
    }
}
