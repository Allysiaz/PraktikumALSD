public class MataKuliahMain {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah();
        mk1.kodeMk = "MTK";
        mk1.nama = "Matematika Dasar";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        mk1.tampilkanInformasi();
        mk1.kurangiJam(2);
        System.out.println();

        MataKuliah mk2 = new MataKuliah("DSR", "Dasar Pemograman", 2, 6);
        mk2.ubahSks(4);
        mk2.tampilkanInformasi();
        System.out.println();

        MataKuliah mk3 = new MataKuliah("ALSD", "Algoritma dan Struktur Data", 4, 4);
        mk3.tambahJam(2);
        mk3.tampilkanInformasi();
        System.out.println();
        }
}