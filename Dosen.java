public class Dosen {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Status Dosen: " + (statusAktif? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian Dosen: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        if (status = true) {
            System.out.println(false);
        }
    }

    void hitungMasaKerja() {
        int thnSkrg = 2025;
        int masaKerja = 0;
        masaKerja = thnSkrg - tahunBergabung; 
        System.out.println("Masa Kerja anda adalah " + masaKerja + " Tahun");
    }

    void ubahKeahlian(String bidangBaru){
        bidangKeahlian = bidangBaru;
    }

    public Dosen (String idDos, String nama, boolean status, int thnGabung, String bidang){
        idDosen = idDos;
        this.nama = nama;
        statusAktif = status;
        tahunBergabung = thnGabung;
        bidangKeahlian = bidang;
    }

    public Dosen () {

    }
}
