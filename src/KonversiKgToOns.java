import java.util.Scanner;

public class KonversiKgToOns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /**
         * Untuk meng input berat dalam kilogram
         */

        System.out.print("Masukkan berat dalam kilogram (KG): ");
        double beratKg = input.nextDouble();

        /**
         * rumus konversi dari berat KG to ons
         */
        double ons = beratKg * 35.274; // 1 KG = 35.274 Ounce

        System.out.println(beratKg + " kilogram adalah setara dengan " + ons + " ons.");
    }
}