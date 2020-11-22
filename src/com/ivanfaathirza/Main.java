package com.ivanfaathirza;

/**
 *
 * @author
 * NAMA     : Ivan Faathirza
 * KELAS    : IF1
 * NIM      : 10119003
 * Deskripsi Program: menampilkan selisih dan hasil penjumlahan menggunakan konsep inheritance dan polymorphism
 */

public class Main {

    public static void main(String[] args) {
	    JumlahBilangan jumlahBilangan = new JumlahBilangan();
	    jumlahBilangan.tampilHasilJumlah();
	    SelisihBilangan selisihBilangan = new SelisihBilangan();
	    selisihBilangan.tampilSelisih();    
    }
}
