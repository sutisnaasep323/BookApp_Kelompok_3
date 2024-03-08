public class BukuNonFiksi extends Buku {
    // Atribut tambahan untuk kelas BukuNonFiksi
    private String jenisNonFiksi;

    // Konstruktor untuk inisialisasi objek BukuNonFiksi
    public BukuNonFiksi(String judul, String penulis, int tahunTerbit, String jenisNonFiksi) {
        super(judul, penulis, tahunTerbit);
        this.jenisNonFiksi = jenisNonFiksi;
    }

    // Metode setter untuk mengatur nilai jenisNonFiksi
    public void setJenisNonFiksi(String jenisNonFiksi) {
        this.jenisNonFiksi = jenisNonFiksi;
    }

    // Metode getter untuk mendapatkan nilai jenisNonFiksi
    public String getJenisNonFiksi() {
        return jenisNonFiksi;
    }

    // Override metode tampilkanInfo untuk menampilkan informasi buku non-fiksi
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil metode tampilkanInfo dari kelas Buku
        System.out.println("Jenis Non-Fiksi: " + jenisNonFiksi);
    }

}

