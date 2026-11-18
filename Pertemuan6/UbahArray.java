package praktikum6;

public class UbahArray {
     public static void main(String[] args) {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};
        
        mobil[1] = "Toyota";
        
        System.out.println("Nilai setelah diubah: " + mobil[1]);
    }
}
