/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasMahlukHidup;

/**
 *
 * @author lmao
 */
public class Mamalia extends Hewan {

    public String alatNafas;
    public int bilikJantung;

    public Mamalia(String nama, String alatNafas, int bilikJantung) {
    }
    
    public Mamalia(String alatNafas) {
        this.alatNafas = alatNafas;
    }

    public Mamalia(String alatNafas, int bilikJantung) {
        this.alatNafas = alatNafas;
        this.bilikJantung = bilikJantung;
    }

}
