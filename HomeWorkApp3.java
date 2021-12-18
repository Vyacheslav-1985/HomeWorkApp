/**
 * Java 1. Homework 3
 * @Author Maksimov Vyacheslav
 * @version 18.12.2021
 *
 */
 

import java.util.Arrays;
import java.util.Scanner;



public class HomeWorkApp3{
    
	public static void main(String[]args) {
        integerArray();
		integerarray100();
		numericarray();
	    squareTwo();
	    methodLI(4,15);
		
		}
        
		static void integerArray() {
		
		int[] integerArray = new int [] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
	    for (int i = 0; i < integerArray.length; i++) {
	    integerArray[i] = 1 - integerArray[i];
        }
	    System.out.println("1, 1, 0, 0, 1, 0, 1, 1, 0, 0");
	    System.out.println(Arrays.toString(integerArray));
        }
 
		static void integerarray100() {
	    
		int[] integerarray100 = new int[100];
        for (int i = 0; i < integerarray100.length; i++) {
        integerarray100[i] = i + 1; 
	    }
	    System.out.println(Arrays.toString(integerarray100));  
        }
        
		static void numericarray() {
        
		int[] numericarray = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < numericarray.length; i++) {
        if (numericarray[i] < 6) {
            numericarray[i] = numericarray[i] * 2;
        }
		System.out.print(numericarray[i] + " ");
        }
        }

        static void squareTwo (){
        
		int[][] squareTwo = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (i == j) {
            squareTwo[i][j] = 1;
            }
        System.out.print(squareTwo[i][j] + " ");
        }
        System.out.println();
        }
        }

        static void methodLI(int len, int initialValue){
        
		int[] methodLI = new int[len];
        for (int i = 0; i < len; i++) {
            methodLI[i] = initialValue; {
        System.out.print("[" + i + "]" + methodLI[i] + " ");
        }
        }
    }

}