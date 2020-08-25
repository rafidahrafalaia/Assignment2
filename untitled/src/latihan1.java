import java.util.Scanner;
public class latihan1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nilaiAwal = 5;
        int nilaiAkhir = 5;

        System.out.print("masukan nilai:");
        int nilaiInput=in.nextInt();

        System.out.print("masukan nilai2:");
        int nilaiInput2=in.nextInt();


        int total= ((nilaiAwal*nilaiInput)+nilaiAkhir)/nilaiInput2;
        System.out.println("hasil:"+total);

    }

}
