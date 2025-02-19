public class DosenMain {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("RDY", "Rudy Irawan", true, 2012, "CTPS");
        dosen1.setStatusAktif(true);
        dosen1.tampilkanInformasi();
        dosen1.hitungMasaKerja();
        System.out.println();

        Dosen dosen2 = new Dosen("MRY", "Mariyana", false, 2023, "Matematika");
        dosen2.tampilkanInformasi();
        System.out.println();

        Dosen dosen3 = new Dosen("VA:", "Vivin Ayu Lestari", true, 2021, "Algoritma");
        dosen3.tampilkanInformasi();
        dosen3.hitungMasaKerja();
        System.out.println();
    }
}