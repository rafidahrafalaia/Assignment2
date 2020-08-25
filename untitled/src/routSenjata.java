import java.util.Scanner;

class routSenjata extends AbstractSenjata {
    int tembak;
    @Override
    public int action(int peluru) {
        int hsl;
        Scanner input = new Scanner(System.in);
        System.out.println("1.tembak\n2.reload");
//        tembak= input.nextInt();
        if(input.nextInt()==1) {
            hsl=tembak(peluru);
            return hsl;
        }
        else if(input.nextInt()==2){
             hsl=reload(peluru);
             return hsl;
        }
        else{
            return 0;
        }
    }

    @Override
    public int tembak(int peluru) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Peluru yang ditembak:");
        int jmlTembakan= input.nextInt();
        int hsl=peluru-jmlTembakan;
        if(hsl<=0)
            hsl=0;
//        System.out.println("Sisa Peluru:"+hsl);
        return hsl;
    }

    @Override
    public int reload(int peluru) {
//        System.out.println("Sisa Peluru:"+(peluru+30));
        return peluru+30;
    }
}
