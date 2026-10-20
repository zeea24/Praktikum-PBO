package praktikum3;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PerbedaanScannerBufferetReader {
    //Class Scanner (java.util.Scanner;)
        //Lebih mudah digunakan karena menyediakan fungsi bawaan untuk memparsing tipe data primitif secara langsung (seperti nextInt(), nextDouble(), dll.).
        //Proses pembacaan sedikit lebih lambat karena harus melakukan parsing tipe data dan pemeriksaan regex di latar belakang.
    //Class BufferetReader (java.io.BufferedReader;)
        //Hanya membaca input sebagai teks (String) melalui method readLine(), sehingga jika ingin memasukkan angka harus dikonversi manual (misal: Integer.parseInt()).
        //Memiliki buffer internal yang lebih besar sehingga performa pembacaan data jauh lebih cepat dan efisien.
    public static void main(String[] args) throws IOException {
        System.out.println("=== PERBEDAAN SCANNER DAN BUFFEREDREADER ===");

        // 1. CONTOH PAKAI SCANNER
        System.out.println("\n--- Menggunakan Class Scanner ---");
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Anda (Scanner) : ");
        String namaScanner = inputScanner.nextLine();
        
        System.out.print("Masukkan Umur Anda (Scanner) : ");
        int umurScanner = inputScanner.nextInt();
        
        System.out.println("Halo " + namaScanner + ", umur Anda " + umurScanner + " tahun.");
        
        // 2. CONTOH PAKAI BUFFEREDREADER
        System.out.println("\n--- Menggunakan Class BufferedReader ---");
        BufferedReader inputBuffer = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Masukkan Nama Anda (BufferedReader) : ");
        String namaBuffer = inputBuffer.readLine();
        
        System.out.print("Masukkan Umur Anda (BufferedReader) : ");
        int umurBuffer = Integer.parseInt(inputBuffer.readLine()); 
        
        System.out.println("Halo " + namaBuffer + ", umur Anda " + umurBuffer + " tahun.");
        
        inputScanner.close();
    }
}