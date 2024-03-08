import java.util.Scanner;

public class ProgramPustakaOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DaftarBuku daftarBuku = new DaftarBuku();

        int menu;

        do {
            System.out.println("Kelompok 3 Sistem Pustaka Online");
            System.out.println("1. Tampilkan Buku");
            System.out.println("2. Tambah Buku");
            System.out.println("3. Hapus Buku");
            System.out.println("4. Cari Buku");
            System.out.println("5. Exit");
            System.out.print("Pilih Menu: ");
            
            menu = scanner.nextInt();
            scanner.nextLine(); 

            menuPilihan(menu, daftarBuku, scanner);
        } while (menu != 5);
    }

    public static void menuPilihan(int pilihan, DaftarBuku daftarBuku, Scanner scanner) {
        switch (pilihan) {
            case 1:
                daftarBuku.tampilkanSemuaBuku();
                break;
            case 2:
                tambahBuku(daftarBuku, scanner);
                break;
            case 3:
                hapusBuku(daftarBuku, scanner);
                break;
            case 4:
                cariBuku(daftarBuku, scanner);
                break;
            case 5:
                System.out.println("Terima kasih! Program selesai.");
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
        }
    }

    public static void tambahBuku(DaftarBuku daftarBuku, Scanner scanner) {
        System.out.println("Masukkan informasi buku:");

        System.out.print("Judul: ");
        String judul = scanner.nextLine();

        System.out.print("Penulis: ");
        String penulis = scanner.nextLine();

        System.out.print("Tahun Terbit: ");
        int tahunTerbit = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Masukkan Kategori Buku : ");
        System.out.println("1. Fiksi ");
        System.out.println("2. Non-Fiksi ");
        int jenisBuku = scanner.nextInt();
        scanner.nextLine();

        if (jenisBuku == 1) {
            System.out.print("Jenis Fiksi: ");
            String jenisFiksi = scanner.nextLine();

            BukuFiksi bukuFiksi = new BukuFiksi(judul, penulis, tahunTerbit, jenisFiksi);
            daftarBuku.tambahBuku(bukuFiksi);
        } else if (jenisBuku == 2) {
            System.out.print("Jenis Non-Fiksi: ");
            String jenisNonFiksi = scanner.nextLine();

            BukuNonFiksi bukuNonFiksi = new BukuNonFiksi(judul, penulis, tahunTerbit, jenisNonFiksi);
            daftarBuku.tambahBuku(bukuNonFiksi);
        } else {
            System.out.println("Jenis buku tidak valid.");
        }
    }

    public static void hapusBuku(DaftarBuku daftarBuku, Scanner scanner) {
        System.out.print("Masukkan judul buku yang ingin dihapus: ");
        String judul = scanner.nextLine();
        daftarBuku.hapusBuku(judul);
    }

    public static void cariBuku(DaftarBuku daftarBuku, Scanner scanner) {
        System.out.print("Masukkan judul buku yang ingin dicari: ");
        String judul = scanner.nextLine();
        daftarBuku.cariBuku(judul);
    }
}

