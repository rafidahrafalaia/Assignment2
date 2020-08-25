//package OOP.Dao;
import java.util.*;
public class karyawan {
    public String nama;
    public String nip;
    public String golongan;
    public double gaji;

    public String getNama() {
        return nama;
    }

    public manager setNama(String nama) {
        this.nama = nama;
        return null;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public String getGolongan() {
        return golongan;
    }
    public void setGolongan(String golongan) {
        this.golongan = golongan;

        switch (golongan.charAt(0)){
            case '1':
                this.gaji=500000;
                break;
            case '2':
                this.gaji=3000000;
                break;
            case '3':
                this.gaji=200000;
                break;
            case '4':
                this.gaji=100000;
                break;
            case '5':
                this.gaji=700000;
                break;
            default:
                System.out.println("Pilihan Tidak Ada!");
                break;
        }
    }
}
