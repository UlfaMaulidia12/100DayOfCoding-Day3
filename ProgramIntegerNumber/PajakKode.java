package ProgramIntegerNumber;

import java.util.Scanner;

public class PajakKode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Minta pengguna untuk memasukkan kode pajak
        System.out.print("Masukkan Kode Pajak (byte)\t\t: ");
        byte kodePajak1 = input.nextByte();
        System.out.print("Masukkan Kode Pajak (short)\t\t: ");
        short kodePajak2 = input.nextShort();
        System.out.print("Masukkan Kode Pajak (int)\t\t: ");
        int kodePajak3 = input.nextInt();
        System.out.print("Masukkan Kode Pajak (long)\t\t: ");
        long kodePajak4 = input.nextLong();

        // Minta pengguna untuk memasukkan persentase pajak
        System.out.print("Masukkan Persentase Pajak (byte)\t: ");
        byte persentasePajak1 = input.nextByte();
        System.out.print("Masukkan Persentase Pajak (short)\t: ");
        short persentasePajak2 = input.nextShort();
        System.out.print("Masukkan Persentase Pajak (int)\t: ");
        int persentasePajak3 = input.nextInt();
        System.out.print("Masukkan Persentase Pajak (long)\t: ");
        long persentasePajak4 = input.nextLong();

        // Menampilkan kode pajak
        System.out.println("Kode Pajak 1 \t\t:" + kodePajak1);
        System.out.println("Kode Pajak 2 \t\t:" + kodePajak2);
        System.out.println("Kode Pajak 3 \t\t:" + kodePajak3);
        System.out.println("Kode Pajak 4 \t\t:" + kodePajak4);

        // Menampilkan persentase pajak
        System.out.println("Persentase Pajak 1 \t: " + persentasePajak1 + "%");
        System.out.println("Persentase Pajak 2 \t: " + persentasePajak2 + "%");
        System.out.println("Persentase Pajak 3 \t: " + persentasePajak3 + "%");
        System.out.println("Persentase Pajak 4 \t: " + persentasePajak4 + "%");

        input.close();
    }
}
