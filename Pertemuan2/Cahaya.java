package praktikum2;

public class Cahaya {
    public static void main(String[] args) {
        double kecepatanCahaya = 300000; // km/s
        double jarakBulan = 384400; // km
        double jarakMatahari = 152.1 * 1000000; // 152.1 juta km
        
        double waktuKeBulan = jarakBulan / kecepatanCahaya;
        double waktuKeMatahari = jarakMatahari / kecepatanCahaya;
        
        System.out.println("Waktu ke Bulan: " + waktuKeBulan + " detik");
        System.out.println("Waktu ke Matahari: " + waktuKeMatahari + " detik");
    }
}
