package praktikum3;
import java.time.LocalTime;
import java.time.Duration;

public class SelisihWaktu {
    public static void main(String[] args) {
        // Menentukan waktu pertama dan waktu kedua
        LocalTime waktuPertama = LocalTime.of(8, 30, 00);   // Pukul 08:30:00
        LocalTime waktuKedua = LocalTime.of(11, 45, 30); // Pukul 11:45:30
        
        Duration selisih = Duration.between(waktuPertama, waktuKedua);
        
        long jam = selisih.toHours();
        long menit = selisih.toMinutes() % 60;
        long detik = selisih.getSeconds() % 60;
        
        System.out.println("=== PROGRAM MENGHITUNG SELISIH WAKTU ===");
        System.out.println("Waktu Pertama : " + waktuPertama);
        System.out.println("Waktu Kedua   : " + waktuKedua);
        System.out.println("Selisih Waktu : " + jam + " jam, " + menit + " menit, " + detik + " detik");
    }
}
