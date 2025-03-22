package metier;
import dao.IDAO;
public class Meteirlmpl implements IMetier{
    private IDAO dao;
    public Meteirlmpl(IDAO dao){
        this.dao=dao;
    }
    @Override
    public double caclul() {
        double t = dao.getData();
        return t*43/43;
    }
}
