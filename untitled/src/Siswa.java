import java.util.*;
import java.lang.*;

public class Siswa {
    private String nama;
    private String kelas;
    private String pelajaran;
    private double nilai;

    public Siswa(String nama, String kelas, String pelajaran, double nilai) {
        this.nama = nama;
        this.kelas = kelas;
        this.pelajaran = pelajaran;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getPelajaran() {
        return pelajaran;
    }

    public void setPelajaran(String pelajaran) {
        this.pelajaran = pelajaran;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
}
