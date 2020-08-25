//RAFIDAH RAFALIA
//20191031
import java.util.*;

abstract class AbstrakLingkaran{
    protected abstract int scan();
    protected abstract void luas(int hslScan);
}

class lingkaran extends AbstrakLingkaran{
    double luas;
    double P1=3.14;
    int r;

    @Override
    protected int scan() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input r:");
        r= input.nextInt();
        return r;
    }

    @Override
    protected void luas(int hslScan) {
        luas=P1*r*r;
        String str = String.format("%.02f", luas);
        System.out.println("Luas:"+str);
    }
}

public class Assignment1 {
    public static void main (String args[]) {

        AbstrakLingkaran ling = new lingkaran();
        ling.luas(ling.scan());

    }
}
