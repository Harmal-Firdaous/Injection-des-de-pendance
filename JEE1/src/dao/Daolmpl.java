package dao;

public class Daolmpl implements IDAO{
    @Override
    public double getData() {
        System.out.println("Version Base de donnees");
        double temp = 23;
        return temp;
    }
}
