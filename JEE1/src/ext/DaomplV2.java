package ext;
import dao.IDAO;
public class DaomplV2 implements IDAO{
    @Override
    public double getData()
    {
        System.out.println("Version web service");
        return 41;
    }
}
