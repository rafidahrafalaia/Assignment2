import java.util.*;
public class staff extends karyawan{
    private int lembur;
    private double gajiLembur;

    public int getLembur() {
        return lembur;
    }

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public void lihatInfo(){
        System.out.println("NIP:"+this.getNip());
        System.out.println("Nama:"+this.getNama());
        System.out.println("Golongan:"+this.getGolongan());
        System.out.println("Jmlh Lembur:"+this.getLembur());
        System.out.println("Gaji Lembur:"+this.getGajiLembur());
        System.out.println("Gaji: %.0f\n"+this.getGaji());
        System.out.println();
    }
}
