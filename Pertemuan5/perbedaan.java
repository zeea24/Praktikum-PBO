package praktikum5;

public class perbedaan {
    public static void main(String[] args) {
        System.out.println("Menggunakan i++");
        int i = 0;
        while (i < 4) {
            System.out.println("Nilai i: " + i++); 
        }

        System.out.println("\nMenggunakan ++i");
        int j = 0;
        while (j < 4) {
            System.out.println("Nilai j: " + ++j); 
        }
    }
}