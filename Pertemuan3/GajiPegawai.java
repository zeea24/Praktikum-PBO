package praktikum3;

public class GajiPegawai {
    public static void main(String[] args) {
        String npm = "5520125086";
        String nama = "Raissa Zebadiah";
        String alamat = "Cipanas, Puncak";
        String jabatan = "Manajer";
        
        double p1 = 2000000; // Gaji Pokok
        double p2 = 300000;  // Tunjangan Jabatan
        double p3 = 200000;  // Tunjangan Istri
        double p4 = 150000;  // Tunjangan Anak
        
        double totalGaji = p1 + p2 + p3 + p4;
        double pajakPenghasilan = 0.10 * totalGaji;
        double gajiBersih = totalGaji - pajakPenghasilan;
        
        System.out.println("=== PROGRAM MENGHITUNG GAJI BERSIH ===");
        System.out.println("Nomor Induk Karyawan : " + npm);
        System.out.println("Nama Karyawan        : " + nama);
        System.out.println("Alamat               : " + alamat);
        System.out.println("Jabatan              : " + jabatan);
        System.out.println("Gaji Pokok           : " + p1);
        System.out.println("Tunjangan Jabatan    : " + p2);
        System.out.println("Tunjangan Istri      : " + p3);
        System.out.println("Tunjangan Anak       : " + p4);
        System.out.println("Total Gaji           : " + totalGaji);
        System.out.println("Pajak Penghasilan    : " + pajakPenghasilan);
        System.out.println("Gaji Bersih          : " + gajiBersih);
    }
}
