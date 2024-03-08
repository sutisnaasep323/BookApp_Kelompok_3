import java.util.ArrayList;

public class DaftarBuku {
    private ArrayList<Buku> daftarBuku;

    public DaftarBuku() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
        System.out.println("Buku berhasil ditambahkan ke daftar.");
    }

    public void hapusBuku(String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                daftarBuku.remove(buku);
                System.out.println("Buku berhasil dihapus dari daftar.");
                return;
            }
        }
        System.out.println("Buku dengan judul '" + judul + "' tidak ditemukan dalam daftar.");
    }

    public void cariBuku(String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                System.out.println("Buku ditemukan:");
                buku.tampilkanInfo();
                return;
            }
        }
        System.out.println("Buku dengan judul '" + judul + "' tidak ditemukan dalam daftar.");
    }

    public void tampilkanSemuaBuku() {
        System.out.println("Daftar Buku:");
        for (Buku buku : daftarBuku) {
            buku.tampilkanInfo();
            System.out.println("------------------------");
        }
    }
}
