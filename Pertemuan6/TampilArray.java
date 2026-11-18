package praktikum6;

public class TampilArray {
     public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};

        System.out.println("Menampilkan array menggunakan perulangan 'for' biasa:");
        for (int i = 0; i < age.length; i++) {
            System.out.println("Indeks " + i + ": " + age[i]);
        }

        System.out.println("\n--------------------------------------------------");

        System.out.println("Menampilkan array menggunakan perulangan 'for-each':");
        for (int nilai : age) {
            System.out.println("Nilai: " + nilai);
        }
    }
}
