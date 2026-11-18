package praktikum6;

import java.util.Scanner;
import java.util.Arrays;

public class JumlahElemen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Masukkan " + n + " buah nilai elemen:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + i + ": ");
            arr[i] = scanner.nextInt();
        }

        int max = arr[0], min = arr[0];
        int idxMax = 0, idxMin = 0;
        int jumlah = 0;
        int jumlahGanjilIndeks = 0; 
        int jumlahGenapIndeks = 0;  

        for (int i = 0; i < n; i++) {
            jumlah += arr[i];

            if (arr[i] > max) {
                max = arr[i];
                idxMax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                idxMin = i;
            }

            if (i % 2 != 0) {
                jumlahGanjilIndeks += arr[i];
            }
            if (i % 2 == 0) {
                jumlahGenapIndeks += arr[i];
            }
        }

        System.out.println("\n--- HASIL ANALISIS ARRAY ---");
        System.out.println("Nilai terbesar: " + max + " pada indeks ke-" + idxMax);
        System.out.println("Nilai terkecil: " + min + " pada indeks ke-" + idxMin);

        double rataRata = (double) jumlah / n;
        System.out.println("Jumlah total data: " + jumlah);
        System.out.println("Nilai rata-rata: " + rataRata);

        System.out.println("Jumlah elemen berindeks ganjil: " + jumlahGanjilIndeks);
        System.out.println("Jumlah elemen berindeks genap: " + jumlahGenapIndeks);

        int cekTarget = jumlahGanjilIndeks; 
        System.out.print("Cek hasil penjumlahan indeks ganjil (" + cekTarget + "): ");
        if (cekTarget % 2 == 0) {
            System.out.println("Bernilai GENAP");
        } else {
            System.out.println("Bernilai GANJIL");
        }
        
        Arrays.sort(arr);
        System.out.println("Array setelah diurutkan: " + Arrays.toString(arr));
        
        scanner.close();
    }
}