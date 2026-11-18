package praktikum5;

import java.util.Scanner;

public class bintang {
    public static void main(String[] args) {
        System.out.println("Half Triangle");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("\nFull Triangle");
        int tinggi = 5;
        int tengah = (tinggi / 2) + 1;
        
        for (int i = 1; i <= tengah; i++) {
            for (int j = 1; j <= (tengah - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = tengah - 1; i >= 1; i--) {
            for (int j = 1; j <= (tengah - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
