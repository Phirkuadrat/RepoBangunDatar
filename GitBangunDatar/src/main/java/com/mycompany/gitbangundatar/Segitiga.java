/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gitbangundatar;

/**
 *
 * @author ASUS
 */
public class Segitiga extends BangunDatar {

    private int alas,tinggi;

    public Segitiga() {
    }

    public Segitiga(int alas, int tinggi, String nama, int jumlahSudut) {
        super(nama, jumlahSudut);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return alas + tinggi + (Math.sqrt(Math.pow(alas, 2)+Math.pow(tinggi, 2)));
    }

}
