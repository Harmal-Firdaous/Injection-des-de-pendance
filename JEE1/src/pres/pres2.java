package pres;

import dao.IDAO;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
    public static void main (String[] args)
    {
        try{
            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassname = scanner.nextLine();
            Class cDao=Class.forName(daoClassname);
            IDAO dao = (IDAO) cDao.getConstructor().newInstance();

            String metierClassname = scanner.nextLine();
            Class cMetier = Class.forName(metierClassname);
            IMetier metier = (IMetier) cMetier.getConstructor().newInstance();

            Method setDao =cMetier.getDeclaredMethod("setDao",IDAO.class);
            setDao.invoke(metier,dao);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}