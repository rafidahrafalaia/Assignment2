import java.util.*;
public class root {
    public static void main (String args[]) {

        System.out.println("PROGRAM TESTING CLASS MANAGER & STAFF");
        manager[] man = new manager[2];
        staff[] staff1 = new staff[2];
        staff[] staff2 = new staff[3];

        //MANAGER

        man[0]=new manager();
        man[0].setNama("Hendro Susanto");
        man[0].setNip("101");
        man[0].setGolongan("1");
        man[0].setTunjangan(500000);
        man[0].setBagian("Administrasi");

        man[1]=new manager();
        man[1].setNama("Atik Belatik");
        man[1].setNip("102");
        man[1].setGolongan("1");
        man[1].setTunjangan(250000);
        man[1].setBagian("Pemasaran");

        //Staff

        staff1[0]=new staff();
        staff1[0].setNama("Duni Kuncoro");
        staff1[0].setNip("003");
        staff1[0].setGolongan("2");
        staff1[0].setLembur(10);
        staff1[0].setGajiLembur(10000);

        staff1[1]=new staff();
        staff1[1].setNama("Habibah");
        staff1[1].setNip("004");
        staff1[1].setGolongan("2");
        staff1[1].setLembur(10);
        staff1[1].setGajiLembur(55000);

        staff2[0]=new staff();
        staff2[0].setNama("Duni Kuncoro");
        staff2[0].setNip("003");
        staff2[0].setGolongan("2");
        staff2[0].setLembur(10);
        staff2[0].setGajiLembur(10000);

        staff2[1]=new staff();
        staff2[1].setNama("Habibah");
        staff2[1].setNip("004");
        staff2[1].setGolongan("2");
        staff2[1].setLembur(10);
        staff2[1].setGajiLembur(55000);

        staff2[2]=new staff();
        staff2[2].setNama("Habibah3");
        staff2[2].setNip("005");
        staff2[2].setGolongan("2");
        staff2[2].setLembur(6);
        staff2[2].setGajiLembur(52000);
    }
}
