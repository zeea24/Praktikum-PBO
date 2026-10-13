package praktikum2;

public class PhytagorasKeliling {
    public static void main(String[] args) {
        double a = 6;
        double b = 8;
        
     //c = sqrt(a^2+b^2)
     double c = Math.sqrt((a*a)+(b*b));
     double keliling = a + b + c;
     
        System.out.println("Nilai c (Sisi Miring) =" + c);
        System.out.println("Keliling Segitiga =" + keliling);
    }
}
