package pres;
import dao.Daolmpl;
import metier.Meteirlmpl;

public class pres1 {
    public static void main(String[] args)
    {
        Daolmpl d = new Daolmpl();
        Meteirlmpl metier = new Meteirlmpl(d);
        System.out.println("RES="+metier.caclul());
    }
}
