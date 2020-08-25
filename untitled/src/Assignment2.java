//RAFIDAH RAFALIA
//20191031
import java.util.Scanner;

public class Assignment2 {
    static Scanner input = new Scanner(System.in);
    static String[][] kelas=new String[2][3];
    public static void main (String args[]) {
        scan();
        print();
    }

    static void scan(){
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++) {
                System.out.print("siapa yang akan duduk di kelas ("+i+")("+j+"): ");
                kelas[i][j]=input.nextLine();
            }
        }
    }

    static void print(){
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++) {
                System.out.print(kelas[i][j]);
                System.out.print("    ");
            }
            System.out.println("");
        }
    }
}
