package Grønhandleren;
import java.util.ArrayList;

public class VareListe {

    ArrayList<Varer> vareLager = new ArrayList<Varer>();
    private Object Agurker;

    public void opteldning(){
        vareLager.add(new Agurker());
        vareLager.add(new Apple());
        vareLager.add(new Peas());
    }

    public int varerIAlt(){return vareLager.size();}
}

   /* public int visLager(){
        for (Agurker:vareLager) {
            System.out.print(Agurker);

        }
    }
    public int antalAgurker(){return 0;}
}
    */
