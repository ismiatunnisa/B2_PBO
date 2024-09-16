/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

/**
 *
 * @author user
 */
public class Perabotan extends Barang {
    private String kategoriPerabotan;
    private int hargaPokok;
    final public String dtperabotan = "Perabotan";
    
    public Perabotan(String nama, String id, int harga, int stokAwal, int stokAkhir, String kategoriPerabotan, int hargaPokok){
        super(nama, id, stokAwal, stokAkhir, harga);
        this.kategoriPerabotan = kategoriPerabotan;
        this.hargaPokok = hargaPokok;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println(" Kategori Barang        : "+this.dtperabotan);
        System.out.println(" Kategori Perabotan     : "+this.kategoriPerabotan);
        System.out.println(" Harga Pokok Perabotan  : "+this.hargaPokok);
        
    }

    public String getKategoriPerabotan() {
        return kategoriPerabotan;
    }

    public int getHargaPokok() {
        return hargaPokok;
    }

    public void setKategoriPerabotan(String kategoriPerabotan) {
        this.kategoriPerabotan = kategoriPerabotan;
    }

    public void setHargaPokok(int hargaPokok) {
        this.hargaPokok = hargaPokok;
    }

    @Override
    public void brgperabotan() {
        System.out.println("Pendataan Barang Perabotan"); 
    }

    @Override
    public void brgpakaian() {
        System.out.println("Pendataan Barang Pakaian"); 
    }

}
