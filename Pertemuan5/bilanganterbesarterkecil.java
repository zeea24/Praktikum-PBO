package praktikum5;

import java.util.Scanner;

public class bilanganterbesarterkecil {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int terbesar = Integer.MIN_VALUE;
        int terkecil = Integer.MAX_VALUE;
        
        System.out.println("Masukkan 10 Bilang!");
        for(int i = 1; i <= 10; i++){
            System.out.print("Bilangan Ke- " + i +": ");
            int bilangan = input.nextInt();
            
            if (bilangan > terbesar){
                terbesar = bilangan;
            }
            if (bilangan < terkecil){
                terkecil = bilangan;
            }
        }
        System.out.println("\nBilangan terbesar adalah: " + terbesar);
        System.out.println("Bilangan terkecil adalah: " + terkecil);
    }
}