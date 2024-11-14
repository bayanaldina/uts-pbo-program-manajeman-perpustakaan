package uts_pemrogramanberorientasiobjek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Perpustakaan perpustakaan = new Perpustakaan();

            perpustakaan.tambahBuku(new Buku("Belajar Pemrograman JAVA", "Abdul Kadir", 2014, "9765379", true));
            perpustakaan.tambahAnggota(new Anggota("Hamidin", 1, "Tanggerang"));
            
            System.out.println("== PROGRAM MANAJEMEN PERPUSTAKAAN ==");
            
            int pilih;
            do {
                System.out.println("MENU PERPUSTAKAAN:");
                System.out.println("1. Tambah Buku");
                System.out.println("2. Daftar Buku Tersedia");
                System.out.println("3. Tambah Anggota");
                System.out.println("4. Pinjam Buku");
                System.out.println("5. Kembalikan Buku");
                System.out.println("6. Tampilkan Info Anggota");
                System.out.println("0. Keluar");
                System.out.print("Pilih menu: ");
                
                pilih = scanner.nextInt();
                scanner.nextLine();
                
                switch (pilih) {
                    case 1:
                        System.out.print("\nMasukkan Judul Buku: ");
                        String judul = scanner.nextLine();
                        System.out.print("Masukkan Pengarang: ");
                        String pengarang = scanner.nextLine();
                        System.out.print("Masukkan Tahun Penerbit: ");
                        int tahunTerbit = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Masukkan ISBN: ");
                        String ISBN = scanner.nextLine();
                        System.out.print("Masukkan Genre Buku: ");
                        String genre = scanner.nextLine();
    
                        perpustakaan.tambahBuku(new GenreBuku(judul, pengarang, tahunTerbit, ISBN, true, genre));
                        System.out.println("\nBuku berhasil ditambahkan.\n");
                        break;
                    case 2:
                        perpustakaan.daftarBukuTersedia();
                        break;
                    case 3:
                        System.out.print("\nMasukkan Nama Anggota: ");
                        String nama = scanner.nextLine();
                        System.out.print("Masukkan Nomor Anggota: ");
                        int nomorAnggota = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Masukkan Alamat: ");
                        String alamat = scanner.nextLine();
                        
                        perpustakaan.tambahAnggota(new Anggota(nama, nomorAnggota, alamat));
                        System.out.println("\nAnggota berhasil ditambahkan.\n");
                        break;
                    case 4:
                        System.out.print("\nMasukkan Judul Buku Peminjaman: ");
                        judul = scanner.nextLine();
                        System.out.print("Masukkan Nomor Anggota: ");
                        nomorAnggota = scanner.nextInt();
                        scanner.nextLine();
                        
                        perpustakaan.pinjamBuku(judul, nomorAnggota);
                        break;
                    case 5:
                        System.out.print("\nMasukkan Judul Buku Pengembalian: ");
                        judul = scanner.nextLine();
                        System.out.print("Masukkan Nomor Anggota: ");
                        nomorAnggota = scanner.nextInt();
                        scanner.nextLine();
                        
                        perpustakaan.kembalikanBuku(judul, nomorAnggota);
                        break;
                    case 6:
                        perpustakaan.tampilkanSemuaAnggota();
                        break;
                    case 0:
                        System.out.println("Keluar dari program.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } while (pilih != 0);
        }
    }
}
