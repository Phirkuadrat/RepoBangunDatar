/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gitbangundatar;

/**
 *
 * @author Dwina
 */
public abstract class BangunDatar {
    private String nama;
    private int jumlahSudut;

    public BangunDatar() {
    }

    public BangunDatar(String nama, int jumlahSudut) {
        this.nama = nama;
        this.jumlahSudut = jumlahSudut;
    }

    public void setJumlahSudut(int jumlahSudut) {
        this.jumlahSudut = jumlahSudut;
    }

    public int getJumlahSudut() {
        return jumlahSudut;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
    
    public abstract double hitungLuas();
    
    public abstract double hitungKeliling();
}
