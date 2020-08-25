// Java program to demonstrate working of Comparator
// interface
import java.util.*;
import java.lang.*;

public class pr {
    public static int max = 3;
    public static int[] nilai = new int[max];
    public static String[] induk = new String[max];
    public static String[] nama = new String[max];
    public static String[] kelas = new String[max];

    public static void main(String[] args) {

        for (int i = 0; i < max; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Nama:");
            nama[i]=input.nextLine();
            System.out.print("Masukkan Kelas:");
            kelas[i]=input.nextLine();
            System.out.print("Masukkan No Induk:");
            induk[i]=input.nextLine();
            System.out.print("Masukkan Nilai:");
            nilai[i] = input.nextInt();
            System.out.println("==================================");
        }

        int[] n = bubbleSort(nilai, max);

        for (int i = 0; i < max; i++) {
            System.out.println("Peringkat Ke-" + (n[i]));
            System.out.println("Nama:"+nama[n[i]]);
            System.out.println("Kelas:"+kelas[n[i]]);
            System.out.println("No Induk:"+induk[n[i]]);
            System.out.println("Nilai:"+nilai[n[i]]);
            System.out.println("==================================");
        }
    }

    public static int[] bubbleSort(int[] nilai, int max) {
        int n = nilai.length;
        int[] index = {0,1,2};
        int x;
        int temp = 0;
        for(int i=0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (nilai[j - 1] > nilai[j]) {
                    //swap elements
                    temp = j - 1;
                    index[j - 1] = j;
                    index[j] = temp;
                }

            }

        }
            return index;
    }
}