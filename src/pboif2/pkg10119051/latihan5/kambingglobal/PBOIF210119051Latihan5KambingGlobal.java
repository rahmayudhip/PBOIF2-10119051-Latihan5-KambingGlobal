/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119051.latihan5.kambingglobal;

/**
 *
 * @author RYP
 * @author RYP
 * NAMA   : Rahmayudhi Prakoso
 * KELAS  : PBOIF2
 * NIM    : 10119051
 * Deskripsi Program : Program ini berisi program untuk menampilkan jumlah Kambing
 */
public class PBOIF210119051Latihan5KambingGlobal {

    /**
     * @param args the command line arguments
     */
    //variabel jumlahkambing menjadi instance
    
    int jumlahKambing= 88;
    // Method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah kambing: "+ jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " +jumlahKambing);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        PBOIF210119051Latihan5KambingGlobal kambingSusu = new PBOIF210119051Latihan5KambingGlobal(); 
        
         //Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        //Menambah satu kambing
        kambingSusu.tambahKambing();
        
        //Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
        
        
    }
    
}
