package praktikum2;

public class PersamaanKuadrat {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        int c = 5;
        
        int diskriminan = (b * b) - (4 * a * c);
        System.out.println("Hasil b^2 - 4ac = " + diskriminan);
    }
}
