/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasMahlukHidup;

/**
 *
 * @author lmao
 */
public class Hewan extends MahlukHidup {

    protected int jumlahTangan;
    protected int jumlahKaki;

    public Hewan() {
    super("kucing");
    }
        
    public Hewan(int jumlahTangan) {
    super("kucing","hitam");
    this.jumlahTangan = jumlahTangan;
    }
    
    public Hewan(int jumlahTangan, int jumlahKaki) {
    super("kucing","hitam",4);
    this.jumlahTangan = jumlahTangan;
    this.jumlahKaki = jumlahKaki;
    }}
