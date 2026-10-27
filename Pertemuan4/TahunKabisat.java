package praktikum4;
import java.util.Scanner;

public class TahunKabisat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        int tahun = scanner.nextInt();
        
        boolean isKabisat = false;
        if (tahun % 4 == 0) {
            if (tahun % 100 == 0) {
                if (tahun % 400 == 0) {
                    isKabisat = true;
                }
            } else {
                isKabisat = true;
            }
        }
        
        if (isKabisat) {
            System.out.println(tahun + " adalah tahun kabisat[cite: 1].");
        } else {
            System.out.println(tahun + " bukan tahun kabisat[cite: 1].");
        }
        scanner.close();
    }
}
