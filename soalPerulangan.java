package Perulangan;

import java.util.Scanner;

public class soalPerulangan {
    public static void main(String[] args) {
        double totalGaji = 0, gajiTertinggi = 0, gajiTerendah = 0 ;

        Scanner c = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Masukkan Gaji Karyawan Ke"+i+":");
            double gaji = c.nextDouble();
            totalGaji += gaji;
        if (i == 1 || gaji>gajiTertinggi) 
            gajiTertinggi = gaji; 
        if (i == 1 || gaji<gajiTerendah)
            gajiTerendah = gaji;
        }

        System.out.println("Total Gaji Karyawan per Bulan adalah: " + totalGaji);
        System.out.println("Gaji Tertinggi per Bulan" + gajiTertinggi);
        System.out.println("Gaji Terendah per Bulan" + gajiTerendah);
    }
}
