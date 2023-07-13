package pbo1uas;

import java.util.Scanner;

public class MobilBeraksi {
    public static void main(String[] args) {
        
        //error handling
        try{
        //io sederhana
        Scanner scanner = new Scanner(System.in);
        
        //array
        MobilDetail[] mbl = new MobilDetail[2];
        
        //perulangan
        for(int i=0; i<mbl.length; i++){
        System.out.print("Masukkan nama mobil "+(i+1)+": ");
        String nama1 = scanner.nextLine();
        System.out.print("Masukkan kode mobil "+(i+1)+": ");
        String kode1 = scanner.nextLine();
        
        //objek
        mbl[i] = new MobilDetail(nama1, kode1);
        }
        
        //perulangan
        for(MobilDetail data: mbl){
        System.out.println("===================");
        System.out.println("Data Mobil: ");
        System.out.println(data.displayInfo());
        }
        
    } catch (Exception e) {
    System.out.println("Kesalahan umum: "+e.getMessage());
    }
    }
}

