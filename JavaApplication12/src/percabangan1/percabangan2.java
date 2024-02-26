package percabangan1;

import java.util.Scanner;


public class percabangan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca inputan sisi
        System.out.print("Masukkan sisi pertama: ");
        int sisi1 = scanner.nextInt();
        System.out.print("Masukkan sisi kedua: ");
        int sisi2 = scanner.nextInt();
        System.out.print("Masukkan sisi ketiga: ");
        int sisi3 = scanner.nextInt();

        // Mengecek apakah semua sisi sama
        boolean isKubus = sisi1 == sisi2 && sisi2 == sisi3;

        // Menampilkan hasil
        if (isKubus) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }
    }
}
