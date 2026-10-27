package praktikum4;
import java.util.Scanner;

public class GajiKaryawan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan NIK: ");
        String nik = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Kode Golongan (1-4): ");
        int golongan = scanner.nextInt();
        System.out.print("Masukkan Jumlah Anak: ");
        int jumlahAnak = scanner.nextInt();
        
        double gajiPokok = 0;
        switch (golongan) {
            case 1:
                gajiPokok = 1200000; // Menikah[cite: 1]
                break;
            case 2:
                gajiPokok = 1500000; // Belum menikah[cite: 1]
                break;
            case 3:
                gajiPokok = 1750000; // Cerai[cite: 1]
                break;
            case 4:
                gajiPokok = 2000000; // Menikah dan punya anak[cite: 1]
                break;
            default:
                System.out.println("Kode golongan tidak valid[cite: 1].");
                scanner.close();
                return;
        }
        
        double tunjanganPasangan = 0.10 * gajiPokok; // 10% dari gaji pokok[cite: 1]
        double tunjanganAnak = 0.05 * gajiPokok * jumlahAnak; // 5% dari gaji pokok dikali jumlah anak[cite: 1]
        double totalTunjangan = tunjanganPasangan + tunjanganAnak; // Jumlah tunjangan pasangan dengan tunjangan anak[cite: 1]
        double gajiBersih = gajiPokok + totalTunjangan; // Jumlah gaji pokok dengan tunjangan[cite: 1]
        
        System.out.println("\n--- Rincian Gaji Karyawan ---");
        System.out.println("NIK: " + nik + "[cite: 1]");
        System.out.println("Nama: " + nama + "[cite: 1]");
        System.out.println("Gaji Pokok: Rp " + gajiPokok + "[cite: 1]");
        System.out.println("Tunjangan Pasangan: Rp " + tunjanganPasangan + "[cite: 1]");
        System.out.println("Tunjangan Anak: Rp " + tunjanganAnak + "[cite: 1]");
        System.out.println("Total Tunjangan: Rp " + totalTunjangan + "[cite: 1]");
        System.out.println("Gaji Bersih: Rp " + gajiBersih + "[cite: 1]");
        
        scanner.close();
    }
}