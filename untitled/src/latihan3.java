import java.util.Scanner;
public class latihan3 {
    public static String[] listPelajaran = {"Matematika", "B. Indonesia", "B. Inggris"};
    public static void main(String[] args){
        System.out.println("Halo Ini Aplikasi Inout Data Siswa!!");
        System.out.println("======================================");
        System.out.print("Masukkan Nama:");
        Scanner input = new Scanner(System.in);
        String nama=input.nextLine();
        System.out.print("Masukkan Kelas:");
        String kelas=input.nextLine();
        printList();
        int indexPelajaran;
        do {
            System.out.print("Masukkan Mata Pelajaran:");
            indexPelajaran=input.nextInt();
        }while(indexPelajaran>listPelajaran.length || indexPelajaran<0);
        System.out.println("======================================");
        System.out.print("Input Jumlah Kuis:");
        double jml=input.nextInt();
        double total=0;
        int nilai;
        for(int a=0;a<jml;a++){
            do{
            System.out.print("Nilai Kuis Ke-"+(a+1)+":");
            nilai= input.nextInt();
            }while(nilai>100 || nilai<0);
            total+=nilai;
        }
        String grade=checkGrade(total/jml);
        System.out.println("====================================");
        System.out.println("Nama:"+nama);
        System.out.println("Kelas:"+kelas);
        System.out.println("Mata Pelajaran:"+listPelajaran[indexPelajaran-1]);
        System.out.println("Grade:"+grade);
    }

    public static String[] printList(){
        for(int i=0;i< listPelajaran.length;i++) {
            System.out.println("Mata Pelajaran-"+(i+1)+": "+listPelajaran[i]);
        }
        return listPelajaran;
    }

    public static String checkGrade(double val) {
        String hasil="";
        if (val >= 80) {
            hasil="A";
        } else if (val >= 70 && val < 80) {
            hasil= "B";
        } else if (val >= 50 && val < 70) {
            hasil= "C";
        } else if (val < 50) {
            hasil= "D";
        }
        return hasil;
    }
}

