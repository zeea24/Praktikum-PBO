package praktikum6;

public class ArrayCampuran {
     public static void main(String[] args) {

        Object[] dataCampuran = {20, 0.5, 'H', "Java", true};

        System.out.println("Daftar data campuran:");
        for (int i = 0; i < dataCampuran.length; i++) {
            System.out.println("Indeks " + i + " = " + dataCampuran[i] + 
                " (Tipe: " + dataCampuran[i].getClass().getSimpleName() + ")");
        }
    }
}