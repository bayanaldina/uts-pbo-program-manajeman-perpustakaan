package uts_pemrogramanberorientasiobjek;

public class GenreBuku extends Buku{
    public String genre;
    
    public GenreBuku(String judul, String pengarang, int tahunTerbit, String ISBN, boolean status, String genre){
        super(judul, pengarang, tahunTerbit, ISBN, status);
        this.genre = genre;
    }
    
    public String getGenre(){
        return genre;
    }
    
    @Override
    public void tampilkanInfoBuku(){
        super.tampilkanInfoBuku();
        System.out.println("Genre Buku: " + genre);
    }
}
