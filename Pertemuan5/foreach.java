package praktikum5;

public class foreach {
    public static void main(String[] args) {
        int[] nilaiArray = {5, 10, 15, 20, 25};

        System.out.println("Menampilkan semua nilai dalam variabel array menggunakan for-each:");

        for (int nilai : nilaiArray) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }
}