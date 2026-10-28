package reader.input.text;
import implementation.Cerc;
import implementation.Figura;
import implementation.Patrat;
import reader.input.ReaderInput;

import java.util.Scanner;

public class Citire implements ReaderInput {
    private Scanner scanner = new Scanner(System.in);

    public Figura citireAtribute(int tip)
    throws ExceptieArgumetGresitTip{
        if(tip == 1)
        {
            System.out.println("Introduceti x , y , raza");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int raza = scanner.nextInt();
            return new Cerc(x,y,raza);
        }
        if(tip == 2)
        {
            System.out.println("Introduceti oX, oY, pX , pY");
            int oX = scanner.nextInt();
            int oY = scanner.nextInt();
            int pX = scanner.nextInt();
            int pY = scanner.nextInt();
            return new Patrat(oX , oY , pX , pY);
        }
        throw new ExceptieArgumetGresitTip("Tip gresit ales");
    }
    public int citireOptiuni()
    {
        System.out.println("1 -> Cerc");
        System.out.println("2 -> Patrat");
        return scanner.nextInt();
    }
}
