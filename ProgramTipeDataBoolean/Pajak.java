package ProgramTipeDataBoolean;

import java.util.Scanner;

public class Pajak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Pendapatan Tahunan: $");
        double pendapatanTahunan = input.nextDouble();

        System.out.print("Masukkan Batas Pendapatan untuk Pajak: $");
        double batasPendapatan = input.nextDouble();

        // Membuat variabel boolean untuk menentukan apakah harus membayar pajak
        boolean harusBayarPajak = pendapatanTahunan > batasPendapatan;

        // Menampilkan hasil perhitungan
        System.out.println("Pendapatan Tahunan \t\t: $" + pendapatanTahunan);
        System.out.println("Batas Pendapatan untuk Pajak \t: $" + batasPendapatan);

        // Menggunakan variabel boolean untuk menentukan apakah harus membayar pajak
        if (harusBayarPajak) {
            System.out.println("Anda harus membayar pajak.");
        } else {
            System.out.println("Anda tidak harus membayar pajak.");
        }

        input.close();
    }
}
