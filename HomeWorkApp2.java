/**
 * Java 1. Homework 2
 * @Author Maksimov Vyacheslav
 * @version 14.12.2021
 *
 */
class HomeWorkApp2 {
    
	public static void main(String[]args) {
        
	    System.out.println(Сhisla(10, 5));
	    ChisloPozNeg(1);
	    System.out.println(ChisloNegative(2));
	    StrokaChislo("NewYear",6);
	}   
	
	static boolean Сhisla(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }
 
        static void ChisloPozNeg(int a) {
	    if (a >= 0) {
        System.out.println("positive");
    }   else {
        System.out.println("negative");
        }
    }

    static boolean ChisloNegative(int a) {
        return (a < 0);
    }
    
	static void StrokaChislo(String s, int Cycle) {
        for (int i = 0; i < Cycle; i++) {
        System.out.println(s);
        }
    }   
} 