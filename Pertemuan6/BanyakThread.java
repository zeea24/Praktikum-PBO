package praktikum6;

import java.util.Scanner;

class CustomThread extends Thread {
    private int nomorThread;

    public CustomThread(int nomor) {
        this.nomorThread = nomor;
    }
    
    @Override
    public void run() {
        System.out.println("Thread anak ke-" + nomorThread + " aktif dan berjalan.");
    }
}

public class BanyakThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah thread yang ingin dibuat: ");
        int jumlahThread = scanner.nextInt();

        for (int i = 1; i <= jumlahThread; i++) {
            CustomThread t = new CustomThread(i);
            t.start(); 
        }
    }
}