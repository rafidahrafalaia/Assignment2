public class oop3 {

    static double maxNumber(double a, double b){
        System.out.println("1");
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    static int maxNumber(int a, int b){
        System.out.println("2");
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    static int maxNumber(int a, int b, int c){
        System.out.println("3");
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main (String[] args){
        System.out.println(maxNumber(10,20));
        System.out.println(maxNumber(4.5,7.5));
        System.out.println(maxNumber(2,5,8));
    }
}
