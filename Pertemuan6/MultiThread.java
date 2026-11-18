package praktikum6;

import java.util.Scanner;

class CustomThread extends Thread {
    private int nomorThread;

    public CustomThread(int nomor) {
        this.nomorThread = nomor;
    }

    @Override
    public void run() {
        System.out.println("Thread anak ke-" + nomorThread + " sedang berjalan. (ID: " + Thread.currentThread().getId() + ")");
    }
}

public class MultiThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah thread anak yang ingin dibuat: ");
        int jumlahThread = scanner.nextInt();

        System.out.println("\n--- Memulai Eksekusi Thread Utama ---");

        // Perulangan untuk membuat dan menjalankan banyak thread
        for (int i = 1; i <= jumlahThread; i++) {
            CustomThread t = new CustomThread(i);
            t.start(); // Memulai eksekusi thread
        }

        System.out.println("Thread utama selesai mengeksekusi pembuatan thread.");
        scanner.close();
    }
}
