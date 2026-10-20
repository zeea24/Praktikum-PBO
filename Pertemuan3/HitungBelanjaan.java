package praktikum3;
import java.io.*;

public class HitungBelanjaan {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String namaFile = "pembelanjaan.dat";
        
        DataOutputStream output = new DataOutputStream(
            new FileOutputStream(namaFile)
        );
        
        output.writeUTF("Zeea"); 
        output.writeDouble(250000.0);       
        output.writeDouble(0.10);           
        output.writeDouble(225000.0);       
        output.writeDouble(300000.0);       
        output.writeDouble(75000.0);        
        
        output.close();
        
        DataInputStream input = new DataInputStream(
            new FileInputStream(namaFile)
        );
        
        String nama = input.readUTF();
        double totalBelanja = input.readDouble();
        double diskon = input.readDouble();
        double total = input.readDouble();
        double bayar = input.readDouble();
        double kembalian = input.readDouble();
        
        input.close();
        
        System.out.println("Nama           : " + nama);
        System.out.println("Total Belanja  : " + totalBelanja);
        System.out.println("Diskon (%)     : " + (diskon * 100) + "%");
        System.out.println("Total          : " + total);
        System.out.println("Bayar          : " + bayar);
        System.out.println("Kembalian      : " + kembalian);
    }
}
