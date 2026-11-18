package praktikum6;

import java.util.Scanner;
import java.util.InputMismatchException;

public class RataRata {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan yang ingin dirata-rata: ");
        int n = 0;

        try {
            n = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Kesalahan: Input harus berupa angka bulat!");
            return;
        }

        double[] bilangan = new double[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            boolean valid = false;
            while (!valid) {
                try {
                    System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                    bilangan[i] = scanner.nextDouble();
                    total += bilangan[i];
                    valid = true; 
                } catch (InputMismatchException e) {
                    System.out.println("Kesalahan: Karakter bukan angka terdeteksi! Silakan masukkan ulang.");
                    scanner.next(); // Membersihkan input yang salah di scanner
                }
            }
        }

        double rataRata = total / n;
        System.out.println("\nNilai rata-rata dari bilangan tersebut adalah: " + rataRata);

        scanner.close();
    }
}
