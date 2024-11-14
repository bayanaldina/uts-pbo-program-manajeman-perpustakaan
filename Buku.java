package uts_pemrogramanberorientasiobjek;

public class Buku {
        public String judul;
        public String pengarang;
        public int tahunTerbit;
        public String ISBN;
        public boolean status;   

    public Buku(String judul, String pengarang, int tahunTerbit, String ISBN, boolean status){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.ISBN = ISBN;
        this.status = status;
    }

    public String getJudul(){
        return judul;
    }

    public boolean isTersedia(){
        return status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }
    
    public void tampilkanInfoBuku(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Status: " + (status ? "Tersedia" : "Dipinjam"));
    }
}
