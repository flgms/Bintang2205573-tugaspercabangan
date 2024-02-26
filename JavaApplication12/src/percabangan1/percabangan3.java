package percabangan1;

import java.util.Scanner;

public class percabangan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //masukan jam masuk dan jam keluar 
        System.out.println("Masukan jam masuk (1-12): ");
        int jamMasuk = input.nextInt();
        System.out.println("Masukan jam keluar (1-12): ");
        int jamKeluar = input.nextInt();
        
        //hitung lama bekerja
        int lamaKerja = jamKeluar - jamMasuk;
        
        //jika jam keluar lebih kesil dari jam masuk, maka lama bekerja adalah 12
        if (jamKeluar < jamMasuk) {
            lamaKerja += 12;
        }
        
        //tampilkan lama bekerja
        System.out.println("Lama bekerja: " + lamaKerja + " jam");
    }
}
