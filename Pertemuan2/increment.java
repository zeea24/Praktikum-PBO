package praktikum2;


public class increment {
    public static void main(String[] args) {
        int angka = 5;
        System.out.println("Nilai awal: " + angka);
        
        //(++angka)
        System.out.println("Nilai dengan ++angka: " + (++angka));
        
       //(angka++)
        System.out.println("Nilai dengan angka++: " + (angka++));
        System.out.println("Nilai setelah angka++: " + angka);
    }
}
