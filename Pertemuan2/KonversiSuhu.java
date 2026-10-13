package praktikum2;

public class KonversiSuhu {
    public static void main(String[] args) {
        double C = 10;
        double F = 15;
        double R = 5;
        
        // a. Celcius ke Fahrenheit dan sebaliknya
        double cToF = (C * 9 / 5) + 32;
        double fToC = (F - 32) * 5 / 9;
        
        // b. Celcius ke Reamur dan sebaliknya
        double cToR = C * 4 / 5;
        double rToC = R * 5 / 4;
        
        // c. Fahrenheit ke Reamur dan sebaliknya
        double fToR = (F - 32) * 4 / 9;
        double rToF = (R * 9 / 4) + 32;
        
        System.out.println("a. " + C + " C = " + cToF + " F | " + F + " F = " + fToC + " C");
        System.out.println("b. " + C + " C = " + cToR + " R | " + R + " R = " + rToC + " C");
        System.out.println("c. " + F + " F = " + fToR + " R | " + R + " R = " + rToF + " F");
    }
}
