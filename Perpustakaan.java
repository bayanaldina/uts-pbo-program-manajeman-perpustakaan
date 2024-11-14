package uts_pemrogramanberorientasiobjek;

import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    public List<Buku> daftarBuku;
    public List<Anggota> daftarAnggota;
    
    public Perpustakaan(){
        this.daftarBuku = new ArrayList<>();
        this.daftarAnggota = new ArrayList<>();
    }
    
    public void tambahBuku(Buku buku){
        daftarBuku.add(buku);
    }
    
    public void daftarBukuTersedia(){
        boolean adaBuku = false;
       
        for (Buku buku : daftarBuku){
            if (buku.isTersedia()){
                if(!adaBuku){
                    System.out.println("\nDaftar Buku Tersedia:\n");                        
                    adaBuku = true;
                }
                buku.tampilkanInfoBuku();
                System.out.println("-------------------------");
            }
        }
        
        System.out.println();           
        if(!adaBuku){
            System.out.println("\nTidak ada buku yang tersedia.\n");
        }
    }
    
    public void tambahAnggota(Anggota anggota){
        daftarAnggota.add(anggota);
    }
    
    public void pinjamBuku(String judul, int nomorAnggota){
        Buku buku = cariBuku(judul);
        Anggota anggota = cariAnggota(nomorAnggota);
        if (buku != null && anggota != null && buku.isTersedia()){
            buku.setStatus(false);
            anggota.peminjamanBuku(buku);
            System.out.println("\nPeminjaman Terverifikasi.\n");
        } else {
            System.out.println("\nPeminjaman Gagal.\n");
        }
    }
    public void kembalikanBuku(String judul, int nomorAnggota){
        Buku buku = cariBuku(judul);
        Anggota anggota = cariAnggota(nomorAnggota);
        if (buku != null && anggota != null){
            anggota.kembalianBuku(buku);
            buku.setStatus(true);
            System.out.println("\nPengembalian Buku Terverifikasi.\n");
        } else {
            System.out.println("\nPengembalian Gagal.\n");
        }
    }
    
    public Buku cariBuku(String judul){
        for (Buku buku : daftarBuku){
            if (buku.getJudul().equalsIgnoreCase(judul)){
                return buku;
            }
        }
        return null;
    }
    
    public Anggota cariAnggota(int nomorAnggota){
        for (Anggota anggota : daftarAnggota){
            if (anggota.getNomorAnggota() == nomorAnggota){
                return anggota;
            }
        }
        return null;
    }
    
    public void tampilkanSemuaAnggota() {
        System.out.println("\nDaftar Semua Anggota:");
        if (daftarAnggota.isEmpty()) {
            System.out.println("\nTidak ada anggota yang terdaftar.\n");
        } else {
            for (Anggota anggota : daftarAnggota) {
                anggota.tampilkanInfoAnggota();
                System.out.println();
            }
        }
    }
}
