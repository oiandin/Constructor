/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasMahlukHidup;

/**
 *
 * @author lmao
 */
public class TumbuhanBerbiji extends Tumbuhan {

    public String jenisBiji;
        
    public TumbuhanBerbiji(String nama, int jumlahDaun){
        this.nama = nama;
        this.jumlahDaun = jumlahDaun;
    }
    
        public TumbuhanBerbiji(String nama, int jumlahDaun, String caraMemproduksiMakanan){
        this.nama = nama;
        this.jenisBiji = jenisBiji;
        this.caraMemproduksiMakanan = caraMemproduksiMakanan;
    }
    
        public TumbuhanBerbiji(String nama, int jumlahDaun, String caraMemproduksiMakanan, String jenisBiji){
        super.nama = "mangga";
        this.jumlahDaun = jumlahDaun;
        this.caraMemproduksiMakanan = caraMemproduksiMakanan;
        this.jenisBiji = jenisBiji;
    }
    
    
}

