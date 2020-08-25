import java.util.Scanner;

public class InputSenjata {
    public static void main (String args[]) {
        String[] jenis = {"Pistol", "SMG", "ShotGun", "Automatic Riffle"};
        senjata[] sjt = new senjata[2];
        AbstractSenjata senjata = new routSenjata();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Senjata Ke-"+(i+1));
            sjt[i] = new senjata();
            for (int j = 0; j < jenis.length; j++) {
                System.out.println((j + 1) + "." + jenis[j]);
            }
            System.out.print("Masukkan Jenis Senjata:");
            sjt[i].setJenis(input.nextInt());
            input.nextLine();
            System.out.print("Masukkan Nama Senjata:");
            sjt[i].setNama(input.nextLine());
            System.out.print("Masukkan Jumlah Peluru:");
            sjt[i].setJmlPeluru(input.nextInt());
            input.nextLine();
            System.out.print("Masukkan Warna Senjata:");
            sjt[i].setWarna(input.nextLine());
            System.out.print("Masukkan Berat Senjata:");
            sjt[i].setBerat(input.nextLine());
            System.out.println("==================================");
        }

        do {
        for(int i=0;i<2;i++){
            System.out.println("SENJATA INDEX KE-:"+(i+1));
            System.out.println("Jenis Senjata: "+jenis[sjt[i].getJenis()-1]);
            System.out.println("Nama Senjata: "+sjt[i].getNama());
            System.out.println("Jumlah Senjata: "+sjt[i].getJmlPeluru());
            System.out.println("Warna Senjata: "+sjt[i].getWarna());
            System.out.println("Berat Senjata: "+sjt[i].getBerat());
            System.out.println("===========================================");
        }

            String str;
            System.out.println("Ingin Melakukan Action(y/n)");
             str = input.nextLine();
            if (str.equalsIgnoreCase("y")) {
                System.out.println("No Index Senjata Yang Dilakukan Action Adalah:");
                int PilihSjt = input.nextInt() - 1;
                int hsl=senjata.action(sjt[PilihSjt].getJmlPeluru());
                sjt[PilihSjt].setJmlPeluru(hsl);
                System.out.println(sjt[PilihSjt].getJmlPeluru());
            }
            else{
                break;
            }
            input.nextLine();
        }while(true);
    }
}
