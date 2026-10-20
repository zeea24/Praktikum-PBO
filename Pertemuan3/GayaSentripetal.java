package praktikum3;
import java.util.Scanner;

public class GayaSentripetal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== PROGRAM MENGHITUNG GAYA SENTRIPETAL ===");
        System.out.print("Masukkan nilai Massa (M dalam kg): ");
        double m = input.nextDouble();
        
        System.out.print("Masukkan nilai Kecepatan (V dalam m/s): ");
        double v = input.nextDouble();
        
        System.out.print("Masukkan nilai Jari-jari (r dalam meter): ");
        double r = input.nextDouble();
        
        // Rumus: Fc = (M * V^2) / r
        double fc = (m * Math.pow(v, 2)) / r;
        
        System.out.println("Hasil Gaya Sentripetal (Fc) = " + fc + " Newton");
        input.close();
    }
}
