package uts_pemrogramanberorientasiobjek;

import java.util.ArrayList;
import java.util.List;

public class Anggota {
    private String nama;
    private int nomorAnggota;
    private String alamat;
    public List<Buku> daftarPinjaman;
    public List<Buku> daftarPengembalian;
    
    public Anggota(String nama, int nomorAnggota, String alamat){
        this.nama = nama;
        this.nomorAnggota = nomorAnggota;
        this.alamat = alamat;
        this.daftarPinjaman = new ArrayList();
        this.daftarPengembalian = new ArrayList();
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setAggota(String nama){
        this.nama = nama;
    }
    
    public int getNomorAnggota(){
        return nomorAnggota;
    }
    
    public void setNomorAnggota(int nomorAnggota){
        this.nomorAnggota = nomorAnggota;
    }
    
    public String alamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public List<Buku> getDaftarPinjaman(){
        return daftarPinjaman;
    }
    
    public List<Buku> getDaftarPengembalian(){
        return daftarPengembalian;
    }
    
    public void peminjamanBuku(Buku buku){
        daftarPinjaman.add(buku);
    }
    
    public void kembalianBuku(Buku buku){
        daftarPengembalian.add(buku);
    }
    
    public void tampilkanBuku1(Buku buku){
        daftarPinjaman.remove(buku);
    }
    
    public void tampilkanBuku(Buku buku){
        daftarPengembalian.remove(buku);
    }
    
    public void tampilkanInfoAnggota(){
        System.out.println("Nama: " + nama);
        System.out.println("Nomor Anggota: " + nomorAnggota);
        System.out.println("Alamat: " + alamat);
        System.out.println("Buku yang dipinjam: ");
        if(daftarPinjaman != null && !daftarPinjaman.isEmpty()){
            for (Buku buku : daftarPinjaman){
                System.out.println(" - " + buku.getJudul());
            }
        } else{
            System.out.println(" - ");
        }
        System.out.println("Buku yang dikembalikan: ");
        if(daftarPengembalian != null && !daftarPengembalian.isEmpty()){
            for (Buku buku : daftarPengembalian){
                System.out.println(" - " + buku.getJudul());
            }
        } else {
            System.out.println(" - ");
        }
    }
}
