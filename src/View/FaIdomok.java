package View;

import java.util.ArrayList;
import java.util.List;
import modell.FaIdom;
import modell.Gomb;
import modell.Hasab;

public class FaIdomok {
    private List<FaIdom> idomok;

    public static void main(String[] args) {
       new FaIdomok();
    }

    public FaIdomok() {
        this.idomok = new ArrayList<>();
        run();
    }
    
    public double osszSuly(){
        double ossz = 0;
        for(FaIdom idom : idomok){
            ossz += idom.suly();
        }
        
        return ossz;
        
    }
    
    public double osszGombSuly(){
        double gombokSulya = 0;
        for(FaIdom faIdom : idomok){
            if(faIdom instanceof Gomb){
                gombokSulya += faIdom.suly();
            }
        }
        
        return gombokSulya;
        
    }
    
     public FaIdom minV() {
        int minI = 0;
        for (int i = 0; i < idomok.size(); i++) {
            if (idomok.get(minI).terfogat() > idomok.get(i).terfogat()) {
                minI = i;
            }
        }
        return idomok.get(minI);
    }

    public FaIdom maxV() {
        int maxI = 0;
        for (int i = 0; i < idomok.size(); i++) {
            if (idomok.get(maxI).terfogat() < idomok.get(i).terfogat()) {
                maxI = i;
            }
        }
        return idomok.get(maxI);
    }
    
    public void run(){
        this.idomok.add(new Gomb(2));
        this.idomok.add(new Gomb(5));
        this.idomok.add(new Hasab(1, 3, 6));
        this.idomok.add(new Hasab(4, 2, 3));
        
        for(FaIdom idom : idomok){
            System.out.println(idom.toString());
        }
        
        System.out.printf("Ossz suly: %.2f\n", osszSuly());
        System.out.printf("Gombok ossz suly: %.2f\n", osszGombSuly());
        System.out.println("minV: " + minV());
        System.out.println("maxV: " + maxV());
    }
    
}
