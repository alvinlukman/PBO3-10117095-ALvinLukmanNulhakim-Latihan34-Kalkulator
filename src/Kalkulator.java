
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama             : Alvin Lukman Nulhakim
 * Nim              : 10117095
 * Kelas            : IF-3
 * Deskripsi        : Program kalkulator
 */
public class Kalkulator {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Kalkulator kalku = new Kalkulator();

        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        kalku.value1 = scn.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        kalku.value2 = scn.nextDouble();

        //format dua digit di belakang koma
        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("\nHasil Penjumlahan : "+kal_1.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+kal_1.kurangBiangan());
        System.out.println("Hasil Perkalian : "+kal_1.kaliBilangan());
        System.out.println("Hasil Pembagian : "+df.format(kal_1.bagiBilangan()));
        System.out.println("Hasil Sisa : "+kal_1.sisaBilangan());
   }
    private double value1;
    private double value2;
    
}
