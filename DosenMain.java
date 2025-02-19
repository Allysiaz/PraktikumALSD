public class DosenMain {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();
        dosen1.idDosen = "RDY";
        dosen1.nama = "Rudy Irawan";
        dosen1.statusAktif = false;
        dosen1.tahunBergabung = 2020;
        dosen1.bidangKeahlian = "Critical Thinking";

        dosen1.tampilkanInformasi();
        dosen1.hitungMasaKerja();
        System.out.println();

        Dosen dosen2 = new Dosen("MRY", "Mariyana", false, 2023, "Matematika");
        dosen2.tampilkanInformasi();
        dosen2.ubahKeahlian("Kalkulus");
        dosen2.tampilkanInformasi();
        dosen2.hitungMasaKerja();
        System.out.println();

        Dosen dosen3 = new Dosen("VA:", "Vivin Ayu Lestari", true, 2021, "Algoritma");
        dosen3.tampilkanInformasi();
        dosen3.setStatusAktif(false);
        dosen3.tampilkanInformasi();
        dosen3.hitungMasaKerja();
        System.out.println();
    }
}