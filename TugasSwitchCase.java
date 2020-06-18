/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class TugasSwitchCase {
    
     public static void main(String[] args) {
       
        String MK;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukan Hari: ");
        MK = scan.nextLine();
        
        switch(MK){
            case "senin":
                System.out.println("Hari Senin Mata Kuliah :");
                System.out.println("Matematika Komputer");
                System.out.println("Rangkaian Logika");
                System.out.println("Organisasi dan Arsitektur Komputer");
                break;
            case "selasa":
                System.out.println("Hari Selasa Mata Kuliah :");
                System.out.println("Matematika Teknik");
                System.out.println("Sistem Informasi");
                System.out.println("Sistem Operasi");
                break;
            case "rabu":
                System.out.println("Hari Rabu Mata Kuliah :");
                System.out.println("Matematika Komputer");
                System.out.println("Algoritma Dasar");
                System.out.println("Lab. Algoritma Dasar");
                break;
            case "kamis":
                System.out.println("Hari Kamis Mata Kuliah :");
                System.out.println("Matematika Komputer");
                System.out.println("Lab. Organisasi dan Arsitektur Komputer");
                System.out.println("Matematika Teknik");
                break;
            case "jumat":
                System.out.println("Hari Jumat Mata Kuliah :");
                System.out.println("Matematika");
                System.out.println("Bahasa Indonesia");
                System.out.println("Bahasa Inggris");
                break;
            default:
                System.out.println("Nama Hari Salah!!");
        }
    }

}
