import java.util.*;
public class manager extends karyawan{

    private double tunjangan;
    private String bagian;
    private staff st[];

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public String getBagian() {
        return bagian;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public staff[] getSt() {
        return st;
    }

    public void setSt(staff[] st) {
        this.st = st;
    }

    private void lihatStaff(){
        System.out.println("=================================");
        for(int i=0;i<st.length;i++){
            st[i].lihatInfo();
        }
        System.out.println("=================================");
    }

    public void lihatInfo(){
        System.out.println("Manager:"+this.getBagian());
        System.out.println("NIP:"+this.getNip());
        System.out.println("Nama:"+this.getNama());
        System.out.println("Golongan:"+this.getGolongan());
        System.out.println("Tunjangan:"+this.getTunjangan());
        System.out.println("Gaji: %.0f\n"+this.getGaji());
        System.out.println("Bagian: %.0f\n"+this.getBagian());
        System.out.println();
        this.lihatStaff();
    }

    public double getGaji(){
        return super.getGaji() + tunjangan;
    }
}
