package praktikum3;
import java.util.Scanner;

public class HitungWaktuCetakNovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("===PROGRAM MENGHITUNG WAKTU PENCETAKAN NOVEL===");
        System.out.print("Masukkan jumlah novel yang akan dicetak : ");
        int jumlahNovel = input.nextInt();
        
        System.out.print("Masukkan tebal halaman per novel        : ");
        int tebalNovel = input.nextInt();

        long totalDetik = (long) jumlahNovel * tebalNovel;

        long hari = totalDetik / 86400;
        long sisaDetik = totalDetik % 86400;
        
        long jam = sisaDetik / 3600;
        sisaDetik = sisaDetik % 3600;
        
        long menit = sisaDetik / 60;
        long detik = sisaDetik % 60;
        
        System.out.println("\n----------------------------------------");
        System.out.println("Total lembar yang dicetak : " + totalDetik + " lembar (detik)");
        System.out.println("Waktu yang diperlukan     :");
        System.out.println("- Hari  : " + hari);
        System.out.println("- Jam   : " + jam);
        System.out.println("- Menit : " + menit);
        System.out.println("- Detik : " + detik);
        
        input.close();
    }
}
