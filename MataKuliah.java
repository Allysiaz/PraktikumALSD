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
        System.out.println("Kode Mata Kuliah: " + kodeMk);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam Pertemuan: " + jumlahJam);
    }

    void ubahSks(int sksBaru){
        sks = sksBaru;
        System.out.println("SKS telah diubah");
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
        
    }

}
