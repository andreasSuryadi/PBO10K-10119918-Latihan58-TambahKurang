/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan58tambahkurang;

/**
 *
 * @author andreas
 */
public class SelisihBilangan extends Bilangan {
    public void tampilSelisih() {
        int hasilSelisih = this.getX() - this.getY();
        System.out.println("Hasil Selisih " + this.getX() + " - "
                + this.getY() + " = " + hasilSelisih);
    }
}
