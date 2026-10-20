package praktikum3;
import java.io.*;

public class TotalBuah {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int manggaAwal = 70;
        int manggaBusuk = 15;
        int manggaBersih = manggaAwal - manggaBusuk;
        
        int jumlahTetangga = 4;
        int jambuPerTetangga = 30;
        int totalJambu = jumlahTetangga * jambuPerTetangga;
        
        int totalBuahDibeli = manggaBersih + totalJambu;
        
        System.out.println("=== PROGRAM PERHITUNGAN BUAH BU SISCA ===");
        System.out.println("Mangga awal dibeli       : " + manggaAwal + " pcs");
        System.out.println("Mangga busuk (dikembalikan): " + manggaBusuk + " pcs");
        System.out.println("Mangga bersih diterima   : " + manggaBersih + " pcs");
        System.out.println("Total Jambu untuk 4 tetangga : " + totalJambu + " pcs");
        System.out.println("Total keseluruhan buah bersih yang dibeli: " + totalBuahDibeli + " pcs");
    }
}
