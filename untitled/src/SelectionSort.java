import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Data: ");
        int jmlh_data=scan.nextInt();
        int[] data= new int[jmlh_data];

        for(int i=0;i<data.length;i++){
            System.out.print("Input Nilai Data Ke-"+(i+1)+": ");
            data[i]=scan.nextInt();
        }

        int[] sortedData=doSelectionsort(data);

        System.out.println("Data Setelah Di Sorting: ");
        for(int i=0;i< sortedData.length;i++){
            System.out.println(data[i]+" ");
        }
    }

    static int[] doSelectionsort(int[] data){
        System.out.println();
        for(int i=0;i<data.length;i++){
            boolean tukar=false;
            int index=0;
            int min=data[i];
            String pesan="Tidak ada pertukaran";
            for(int j=i+1;j<data.length;j++){
                if(min>data[j]){
                    tukar=true;
                    index=j;
                    min=data[j];
                }
            }
            if(tukar==true){
                pesan="Angka "+data[i]+" ditukar";
                int temp=data[i];
                data[i]=data[index];
                data[index]=temp;
            }
        }
        return data;
    }
}
