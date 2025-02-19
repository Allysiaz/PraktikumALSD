public class Mahasiswamain13 {

    public static void main(String[] args) {
        Mahasiswa13 mhs1 = new Mahasiswa13(); //Proses Instansiasi
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        //Proses Instansiasi
        Mahasiswa13 mhs2 = new Mahasiswa13("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        //Proses Instansiasi
        Mahasiswa13 mhsNadine = new Mahasiswa13("Nadine Jullietta Allysia", "244107060099", 3.80, "SIB 1D");
        mhsNadine.updateIpk(4.00);
        mhsNadine.tampilkanInformasi();
    }
}