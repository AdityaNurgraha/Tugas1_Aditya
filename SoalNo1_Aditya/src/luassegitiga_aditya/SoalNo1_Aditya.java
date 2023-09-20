/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SoalNo1_aditya;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class SoalNo1_Aditya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here public static void main(String[] args) {
         // Membuat objek Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Mendeklarasikan variabel untuk menyimpan panjang alas dan tinggi segitiga
        double alas, tinggi;
        
        // Meminta pengguna memasukkan panjang alas
        System.out.print("Masukkan panjang alas segitiga: ");
        alas = scanner.nextDouble();
        
        // Meminta pengguna memasukkan tinggi segitiga
        System.out.print("Masukkan tinggi segitiga: ");
        tinggi = scanner.nextDouble();
        
        // Menghitung luas segitiga
        double luas = 0.5 * alas * tinggi;
        
        // Menampilkan hasil luas segitiga
        System.out.println("Luas segitiga adalah: " + luas);
        
        // Menutup objek Scanner
        scanner.close();
    }
}