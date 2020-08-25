import java.util.Scanner;
public class latihan2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan nilai max:");
        int max=input.nextInt();
        double total=0;
        for(int a=0;a<=max;a++){
            System.out.println("ini adalah perulangan ke-"+(a+1));
            System.out.print("masukan nilai:");
            Scanner input2 = new Scanner(System.in);
            double nilai=input2.nextInt();
            if((a) % 2 == 0){
                nilai*=max;
            }
            else{
                nilai/=max;
            }
            total+=(nilai);
        }
        System.out.println("=================================");
        System.out.println("total="+total);
    }
}
