/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/*Nama :veri ajie saputra
 *KELAS:pbo
 *NIM  :23215017
 * 
 */
import java.util.Scanner;

public class Latihan_24_PerbandinganNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulangi;
        
        do {
            // Menampilkan header program
            System.out.println("========Program Perbandingan Nilai========");
            
            // Meminta input nilai pertama
            System.out.print("Masukkan nilai pertama : ");
            int nilai1 = input.nextInt();
            
            // Meminta input nilai kedua
            System.out.print("Masukkan nilai kedua : ");
            int nilai2 = input.nextInt();
            
            // Membandingkan nilai dan menampilkan hasil
            System.out.print("Hasil : " + nilai1);
            if (nilai1 > nilai2) {
                System.out.println(" Lebih besar dari " + nilai2);
            } else if (nilai1 < nilai2) {
                System.out.println(" Lebih kecil dari " + nilai2);
            } else {
                System.out.println(" Sama dengan " + nilai2);
            }
            
            // Menanyakan apakah ingin mengulang
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            ulangi = input.next();
            
            // Memberi baris kosong jika akan mengulang
            if (ulangi.equalsIgnoreCase("Ya")) {
                System.out.println();
            }
            
        } while (ulangi.equalsIgnoreCase("Ya"));
        
        input.close();
    }
}
