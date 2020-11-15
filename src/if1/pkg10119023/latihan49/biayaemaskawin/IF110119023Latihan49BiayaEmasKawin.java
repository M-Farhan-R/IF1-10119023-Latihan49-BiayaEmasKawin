/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan49.biayaemaskawin;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : 
 *
 */
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols; //custom format
public class IF110119023Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Emas e = new Emas();
        DecimalFormatSymbols d = new DecimalFormatSymbols();
        d.setGroupingSeparator('.');
        DecimalFormat f = new DecimalFormat("#,###",d);
        e.setBerat(15.7f);
        e.setHarga(570000);
        
        int h = e.getHarga();
        float b = e.getBerat();
        
        e.setTotalHarga(h, b);
        
        System.out.println("===Hitung Harga Emas===");
        System.out.println("Harga per gram emas        = Rp."+f.format(h));
        System.out.println("Berat emas yang dibutuhkan : "+b);
        System.out.println("--------------------------------");
        System.out.println("Total harga : Rp."+f.format(e.getTotalHarga()));
    }

}
