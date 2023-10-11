import java.util.Scanner;

public class PajakTahundanBulan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan Pendapatan Tahunan (Float): $");
            float pendapatanTahunan = input.nextFloat();

            System.out.print("Masukkan Tarif Pajak (Float): ");
            float tarifPajak1 = input.nextFloat();

            System.out.print("Masukkan Pendapatan Bulanan (Double): $");
            double pendapatanBulanan = input.nextDouble();

            System.out.print("Masukkan Tarif Pajak (Double): ");
            double tarifPajak2 = input.nextDouble();

            if (pendapatanTahunan < 0 || tarifPajak1 < 0 || tarifPajak1 > 100 || pendapatanBulanan < 0 || tarifPajak2 < 0 || tarifPajak2 > 100) {
                System.out.println("Input tidak valid. Pendapatan harus positif, dan tarif pajak harus dalam rentang 0-100%.");
            } else {
                float jumlahPajak1 = pendapatanTahunan * (tarifPajak1 / 100);
                double jumlahPajak2 = pendapatanBulanan * (tarifPajak2 / 100);

                // Menampilkan hasil perhitungan dengan format yang sesuai
                System.out.println("Pendapatan Tahunan (Float)\t: $" + String.format("%.2f", pendapatanTahunan));
                System.out.println("Tarif Pajak (Float)\t\t: " + String.format("%.2f", tarifPajak1) + "%");
                System.out.println("Jumlah Pajak (Float)\t\t: $" + String.format("%.2f", jumlahPajak1));

                System.out.println("\nPendapatan Bulanan (Double)\t: $" + String.format("%.2f", pendapatanBulanan));
                System.out.println("Tarif Pajak (Double)\t\t: " + String.format("%.2f", tarifPajak2) + "%");
                System.out.println("Jumlah Pajak (Double)\t\t: $" + String.format("%.2f", jumlahPajak2));
            }
        } catch (Exception e) {
            System.out.println("Input tidak valid. Pastikan Anda memasukkan angka yang benar.");
        } finally {
            input.close();
        }
    }
}
