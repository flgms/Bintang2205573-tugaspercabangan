package percabangan1;
import java.util.Scanner;
public class percabangan1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca inputan karakter
        System.out.print("Masukkan karakter pertama: ");
        char karakter1 = scanner.next().charAt(0);
        System.out.print("Masukkan karakter kedua: ");
        char karakter2 = scanner.next().charAt(0);
        System.out.print("Masukkan karakter ketiga: ");
        char karakter3 = scanner.next().charAt(0);

        // Mengecek apakah karakter adalah huruf kecil
        if (!Character.isLowerCase(karakter1) || !Character.isLowerCase(karakter2) || !Character.isLowerCase(karakter3)) {
            System.out.println("Inputan bukan huruf kecil semua!");
            return;
        }

        // Mengecek apakah karakter memiliki urutan konsonan-vokal-konsonan
        boolean isKonsonanVokalKonsonan = isKonsonan(karakter1) && isVokal(karakter2) && isKonsonan(karakter3);

        // Menampilkan hasil
        if (isKonsonanVokalKonsonan) {
            System.out.println("Karakter memiliki urutan konsonan-vokal-konsonan.");
        } else {
            System.out.println("Karakter tidak memiliki urutan konsonan-vokal-konsonan.");
        }
    }

    private static boolean isKonsonan(char karakter) {
        return !"aiueo".contains(String.valueOf(karakter));
    }

    private static boolean isVokal(char karakter) {
        return "aiueo".contains(String.valueOf(karakter));
    }
    }
    
