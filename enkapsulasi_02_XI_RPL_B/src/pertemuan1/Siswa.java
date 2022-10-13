/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

/**
 *
 * @author AHNAF
 */
public class Siswa {
    
    private String nama;
    private int nilai = 0;
    private String kelas;
    
    public void isiData(){
        nama = "Ahnaf";
        nilai = 88;
        kelas = "XI RPL B";
    }
    
    public void cetak(){
    System.out.println("Nama  : "+ nama);
    System.out.println("Nilai : "+ nilai);
    System.out.println("Kelas : "+ kelas);
    }
}
