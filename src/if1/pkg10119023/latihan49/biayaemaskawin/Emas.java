/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan49.biayaemaskawin;

/**
 *
 * @author Muhammad Farhan R 
 */
public class Emas {
    private float berat,totalHarga;
    private int harga;
    
    public float getBerat(){
        return berat;
    }
    
    public void setBerat(float berat){
        this.berat = berat;
    }
    
    public int getHarga(){
        return harga;
    }
    
    public void setHarga(int harga){
        this.harga = harga;
    }
    
    public void setTotalHarga(int harga, float berat){
        totalHarga = (float)harga * berat;
    }
    
    public float getTotalHarga(){
        return totalHarga;
    }
}
