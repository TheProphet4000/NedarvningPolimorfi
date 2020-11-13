package Grønhandleren;
import java.util.ArrayList;

public class VareListe {

    ArrayList<Varer> vareLager = new ArrayList<>();

    public void opteldning(){
        vareLager.add(new Agurker());
        vareLager.add(new Apple());
        vareLager.add(new Peas());
    }

    public int varerIAlt(){return vareLager.size();}

    /*public void visLager(){
        int i = 0;
        for (i != vareLager.size();) {
            return(" ");
        }
    }*/
    public int antalAgurker(){return 0;}
}
