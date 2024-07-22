/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaan;

/**
 *
 * @author Asus
 */
public class Main {

    public static void main(String[] args) {
        PerpustakaanUmum perpustakaan = new PerpustakaanUmum();
        perpustakaan.pinjamBuku("Buku A");
        perpustakaan.kembalikanBuku("Buku B");
        perpustakaan.lihatDaftarBuku();
    }
}