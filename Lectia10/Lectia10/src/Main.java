import types.*;

public class Main {
    public static void main(String[] args)
    {
//        System.out.println("w");
        Colectie c1 = new Colectie();
        Colectie c2 = new Colectie();
        Colectie c3 = new Colectie();
        Intreg intreg1 = new Intreg(7);
        Intreg intreg2 = new Intreg(4);
        Intreg intreg3 = new Intreg(2);
        Intreg intreg4 = new Intreg(8);

        Sir sir1 = new Sir("Eu");
        Sir sir2 = new Sir("(1,2)");

        c1.addElement(intreg1);
        c1.addElement(intreg2);
        c1.addElement(sir1);

        c2.addElement(intreg3);
        c2.addElement(intreg4);

        c1.addElement(c2);

        c3.addElement(intreg1);
        c3.addElement(intreg2);
        c3.addElement(sir1);
        c3.addElement(c2);

        System.out.println("c1:" +c1);
        System.out.println("c2:" +c2);
        System.out.println("c3:" +c3);

        System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c2));
    }
}
