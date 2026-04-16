package main;

import model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("=== CLEAN GO ===");
            System.out.println("1. Regular Cleaning");
            System.out.println("2. Deep Cleaning");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            int pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 3) {
                System.out.println("Terima kasih!");
                break;
            }

            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Alamat: ");
            String alamat = input.nextLine();

            Pelanggan p = new Pelanggan(nama, alamat);

            System.out.print("Durasi (jam): ");
            int durasi = input.nextInt();

            Layanan layanan;

            switch (pilihan) {
                case 1:
                    layanan = new RegularCleaning();
                    break;
                case 2:
                    layanan = new DeepCleaning();
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    continue;
            }

            int total = layanan.hitungHarga(durasi);

            System.out.println("\n=== STRUK ===");
            System.out.println("Nama: " + p.getNama());
            System.out.println("Layanan: " + layanan.getNamaLayanan());
            System.out.println("Total: Rp " + total);
            System.out.println("====================\n");
        }
    }
}