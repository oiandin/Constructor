/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import TugasMahlukHidup.Hewan;
import TugasMahlukHidup.Tumbuhan;
import TugasMahlukHidup.TumbuhanBerbiji;
import TugasMahlukHidup.Mamalia;

/**
 *
 * @author lmao
 */

public class MainClass {
    public static void main(String[] args) {
        Mamalia kucing = new Mamalia("paru - paru",4);
        System.out.println("Saya adalah hewan " + kucing.nama);
        System.out.println("Saya bernafas dengan "+ kucing.alatNafas);
        System.out.println("Jantung saya memiliki "+ kucing.bilikJantung +" bilik");

        System.out.println("=========================================");

        TumbuhanBerbiji mangga = new TumbuhanBerbiji ("",13,"fotosintesis","tertutup");
        System.out.println("Saya adalah tumbuhan "+ mangga.nama);
        System.out.println("Saya disebut tumbuhan karena saya bisa "+ mangga.caraMemproduksiMakanan );
        System.out.println("dan saya memiliki daun sebanyak " + mangga.jumlahDaun + " helai");
        System.out.println("Saya merupakan tumbuhan berbiji "+ mangga.jenisBiji);

    }
}

