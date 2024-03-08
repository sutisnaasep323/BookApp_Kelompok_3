public class BukuFiksi extends Buku {
    // Atribut tambahan untuk kelas BukuFiksi
    private String jenisFiksi;

    // Konstruktor untuk inisialisasi objek BukuFiksi
    public BukuFiksi(String judul, String penulis, int tahunTerbit, String jenisFiksi) {
        super(judul, penulis, tahunTerbit);
        this.jenisFiksi = jenisFiksi;
    }

    // Metode setter untuk mengatur nilai jenisFiksi
    public void setJenisFiksi(String jenisFiksi) {
        this.jenisFiksi = jenisFiksi;
    }

    // Metode getter untuk mendapatkan nilai jenisFiksi
    public String getJenisFiksi() {
        return jenisFiksi;
    }

    // Override metode tampilkanInfo untuk menampilkan informasi buku fiksi
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil metode tampilkanInfo dari kelas Buku
        System.out.println("Jenis Fiksi: " + jenisFiksi);
    }
}

