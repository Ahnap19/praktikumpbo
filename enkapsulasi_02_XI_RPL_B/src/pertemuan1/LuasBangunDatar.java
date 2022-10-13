/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;
import java.util.Scanner;
/**
 *
 * @author AHNAF
 */
public class LuasBangunDatar {
     private static int HitungLuasPersegi(int sisi){
         //Rumus Luas Persegi = sisi * sisi
 
        int luas = sisi * sisi;
 
        return luas;
     }
      private static int HitungLuasPersegiPanjang(int panjang, int lebar){
          //Rumus Luas Persegi Panjang = panjang * lebar
 
        int luas = panjang * lebar;
 
        return luas;
      }
      private static double HitungLuasSegitiga(int alas,int tinggi){
           //Rumus Luas Segitiga = 1/2 * (alas * tinggi)
 
        double luas = 0.5 * (alas * tinggi);
 
        return luas;
      }
      private static double HitungLuasLingkaran(int diameter){
          //Rumus Luas Lingkaran = phi * r * r
 
        //r = 1/2 * diamter (jari-jari)
 
        //phi bisa 22/7 dan 3.14
          
           double r = 0.5 * diameter;
 
        double luas = 0;
 
        if(r % 7 == 0){
            luas = 22 * (r*r/7);
        }
        else{
         luas = 3.14 * r * r;   
        }
         return luas;
      }
      private static boolean CekValue(String value){
          try {
               Integer.parseInt(value);
                return true;
          }
          catch (NumberFormatException ex) {
          }
          return false;
      }
      public static void main(String[] args) {
           //Pilihan untuk hitung luas
 
        Scanner input = new Scanner(System.in);
 
        
 
        System.out.println("Silahkan luas apa yang akan anda hitung !");
 
        System.out.println("A. Persegi");
 
        System.out.println("B. Persegi Panjang");
 
        System.out.println("C. Segitiga");
 
        System.out.println("D. Lingkaran");
 
        System.out.println();
 
        System.out.print("Masukan pilihan anda : ");
 
        String choise = input.nextLine();
 
        System.out.println("=================================================");
        
        switch(choise.toLowerCase()){
             case "a":
 
                System.out.println("Menghitung Luas Persegi");
 
                System.out.print("Masukan Nilai Sisi : ");
 
                String sisi = input.nextLine();
        }
         String sisi = null;
        if(CekValue(sisi)){
            int s = Integer.parseInt(sisi);
 
                    int luas = HitungLuasPersegi(s);
 
                    System.out.println("Luas Persegi anda : "+luas);   
        }
        else{
            System.out.println("Nilai yang anda masukan harus integer");
        }
        break;
 
            case "b":
 
                System.out.println("Menghitung Luas Persegi Panjang");
 
                System.out.print("Masukan Nilai Panjang : ");
 
                String panjang = input.nextLine();
 
                System.out.print("Masukan Nilai Lebar : ");
 
                String lebar = input.nextLine();
 
                if(CekValue(panjang) && CekValue(lebar)){
        
      }
      }
}
