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
public class Tugas1IfElse {
    
    public static void main(String[] args) {
        HitungIPK();
       
    }
    
    public static void HitungIPK() {
        
        Double IPK;
        Double IP1, IP2, IP3, IP4, IP5, IP6, IP7, IP8;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukan IP Semester 1: ");
        IP1 = scan.nextDouble();
        System.out.println("Masukan IP Semester 2: ");
        IP2 = scan.nextDouble();
        System.out.println("Masukan IP Semester 3: ");
        IP3 = scan.nextDouble();
        System.out.println("Masukan IP Semester 4: ");
        IP4 = scan.nextDouble();
        System.out.println("Masukan IP Semester 5: ");
        IP5 = scan.nextDouble();
        System.out.println("Masukan IP Semester 6: ");
        IP6 = scan.nextDouble();
        System.out.println("Masukan IP Semester 7: ");
        IP7 = scan.nextDouble();
        System.out.println("Masukan IP Semester 8: ");
        IP8 = scan.nextDouble();
        
        IPK = (IP1+IP2+IP3+IP4+IP5+IP6+IP7+IP8)/8;
        System.out.println("IPK anda adalah= "+IPK);
        
        if (IPK>=3.80){
            System.out.println("Summa Cum Laude");
        }else if (IPK>3.60 && IPK<3.79){
            System.out.println("Magna Cum Laude");
        }else if (IPK>3.40 && IPK<3.59){
            System.out.println("Cum Laude");
        }else if (IPK>3.20 && IPK<3.39){
            System.out.println("High Merit");
        }else if (IPK>3.00 && IPK<3.19){
            System.out.println("Merit");
        }
}
}
