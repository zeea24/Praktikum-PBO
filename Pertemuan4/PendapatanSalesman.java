package praktikum4;
import java.util.Scanner;

public class PendapatanSalesman {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan total penjualan hari ini: Rp ");
        double penjualan = scanner.nextDouble();
        
        double uangJasa = 0;
        double persentaseKomisi = 0;
        
        if (penjualan <= 2000000) {
            uangJasa = 100000; // Rp100.000[cite: 1]
            persentaseKomisi = 0.10; // 10%[cite: 1]
        } else if (penjualan <= 5000000) {
            uangJasa = 200000; // Rp200.000[cite: 1]
            persentaseKomisi = 0.15; // 15%[cite: 1]
        } else {
            uangJasa = 300000; // Rp300.000[cite: 1]
            persentaseKomisi = 0.20; // 20%[cite: 1]
        }
        
        double komisi = persentaseKomisi * penjualan; // Uang komisi dari pendapatan hari itu[cite: 1]
        double totalPendapatan = uangJasa + komisi; // Uang jasa ditambah uang komisi[cite: 1]
        
        System.out.println("\n--- Rincian Pendapatan Salesman ---");
        System.out.println("Total Penjualan: Rp " + penjualan + "[cite: 1]");
        System.out.println("Uang Jasa: Rp " + uangJasa + "[cite: 1]");
        System.out.println("Komisi (" + (persentaseKomisi * 100) + "%): Rp " + komisi + "[cite: 1]");
        System.out.println("Total Pendapatan: Rp " + totalPendapatan + "[cite: 1]");
        
        scanner.close();
    }
}
