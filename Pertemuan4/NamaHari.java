package praktikum4;
import java.util.Scanner;

public class NamaHari {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode hari (1-7): ");
        int kode = scanner.nextInt();
        
        String namaHari;
        switch (kode) {
            case 1:
                namaHari = "Senin";
                break;
            case 2:
                namaHari = "Selasa";
                break;
            case 3:
                namaHari = "Rabu";
                break;
            case 4:
                namaHari = "Kamis";
                break;
            case 5:
                namaHari = "Jumat";
                break;
            case 6:
                namaHari = "Sabtu";
                break;
            case 7:
                namaHari = "Minggu";
                break;
            default:
                namaHari = "Kode hari tidak valid";
        }
        
        System.out.println("Nama hari: " + namaHari + "");
        scanner.close();
    }
}
