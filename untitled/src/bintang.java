import java.util.Scanner;
public class bintang {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int max= input.nextInt();
        for(int i=0;i<max;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
    }
}
}
