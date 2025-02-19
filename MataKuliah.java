public class MataKuliah {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah(String kodeMk, String nama, int sks, int jumlahJam){
    this.kodeMk = kodeMk;
    this.nama = nama;
    this.sks = sks;
    this.jumlahJam = jumlahJam;
    }

    public MataKuliah() {

    }

    void tampilkanInformasi(){
        System.out.println("==== Informasi Mata Kuliah ====");
        System.out.println("Kode Mata Kuliah    : " + kodeMk);
        System.out.println("Nama                : " + nama);
        System.out.println("SKS                 : " + sks);
        System.out.println("Jumlah Jam Pertemuan: " + jumlahJam);
        System.out.println();
    }

    void ubahSks(int sksBaru){
        sks = sksBaru;
    }

    void tambahJam(int jam){
        jumlahJam += jam;
    }

    void kurangiJam(int jam){
        if (jumlahJam>jam) {
            jumlahJam -= jam;
        } else {
            System.out.println("Jumlah Jam lebih kecil dari Jam Pengurang");
        }
        System.out.println();
    }
}