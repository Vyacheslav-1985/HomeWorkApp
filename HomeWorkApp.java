/**
 * Java 1. Homework 1
 * @Author Maksimov Vyacheslav
 * @version 09.12.2021
 *
 */
public class HomeWorkApp {
    public static void main(String[]args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    {
        checkSumSign();
    }
    static void checkSumSign() {
        int a = 10;
        int b = 15;
        if (a + b >= 0) {
            System.out.println("The amount is positive");
        } else {
            System.out.println("The amount is negative");
        }
    }

    static void printColor() {
        int value = 135;
        if (value <= 0) {
            System.out.println("red");
        } else if (value > 0 && value <= 100) {
            System.out.println("yellow");
        } else if (value > 100) {
            System.out.println("green");
        }
    }
    static void compareNumbers() {
        int a = 32;
        int b = 40;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
