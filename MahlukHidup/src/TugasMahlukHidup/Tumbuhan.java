/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasMahlukHidup;

/**
 *
 * @author lmao
 */
public class Tumbuhan extends MahlukHidup {
    public Tumbuhan(){super("mangga");
}
    public int jumlahDaun;
    public int jumlahBatang;
    public String caraMemproduksiMakanan;
    
    public Tumbuhan(String nama, int jumlahDaun){
    super("Mangga","Kuning",1);
    this.jumlahDaun = jumlahDaun; }
    
    public Tumbuhan(int jumlahDaun, int jumlahBatang){
    super("Mangga","Kuning",1);
    this.jumlahDaun = jumlahDaun;
    this.jumlahBatang = jumlahBatang;    
        }
    
    public Tumbuhan(int jumlahDaun, int jumlahBatang, String caraMemproduksiMakanan){
    super("Mangga","Kuning",1);
    this.jumlahDaun = jumlahDaun;
    this.jumlahBatang = jumlahBatang;
    this.caraMemproduksiMakanan = caraMemproduksiMakanan;
    }
  
}
