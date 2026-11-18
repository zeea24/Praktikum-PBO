package praktikum5;

import java.util.Scanner;

public class penjumlahan {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Bilangan : ");
        int n = input.nextInt();
        
        double total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            double bilangan = input.nextDouble();
            total += bilangan;
        }
        
        double rataRata = total / n;
        
        System.out.println("\nJumlah total bilangan: " + total);
        System.out.println("Rata-rata bilangan: " + rataRata);
    }
}