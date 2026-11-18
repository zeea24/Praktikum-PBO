package praktikum5;

import java.util.Scanner;

public class AngkaGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Banyak Angka : ");
        int n = input.nextInt();
        
        int total =0;
        int ganjil =1;
        
        for (int i = 1; i <= n; i++) {
            System.out.print(ganjil + " ");
            total += ganjil;
            ganjil += 2;
        }
        
        System.out.println("\nTotal penjumlahan : " + total);
    }
}
