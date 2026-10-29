import implementation.*;
import reader.input.text.Citire;
import reader.output.text.Afisare;

public class Main {
    public static void main(String[] args)
    {
//        Patrat patrat1 = new Patrat(1,1,2,3);
//        Patrat patrat2 = new Patrat(10,5,2,3);
//        Patrat patrat3 = new Patrat(3,4,2,3);
//        Cerc cerc1 = new Cerc(1, 1 , 5);
//        Cerc cerc2 = new Cerc(1,2 , 5);
//        Cerc cerc3 = new Cerc(5 , 1, 5);
//
//        Stiva stack = null;
//        try {
//            stack = new Stiva(7);
//            stack.addToStack(patrat1);
//            stack.addToStack(patrat2);
//            stack.addToStack(patrat3);
//            stack.addToStack(cerc1);
//            stack.addToStack(cerc2);
//            stack.addToStack(cerc3);
//        }
//        catch (ExceptieConstructorStiva e) {System.out.println("Dimensiune gresita");}
//        catch (ExceptieAdaugareStiva e){System.out.println("Nu mai e loc e stiva");}
//        catch (ExceptieObiectIdenticStiva e){System.out.println("Elementul " + ExceptieObiectIdenticStiva.getSameObj() + " este deja stocat");}
//        catch (ExceptieObiectGresit e){System.out.println("Obiect gresit");}
//
//        try{
//            System.out.println(stack.pop());
//        }
//        catch (ExceptieStivaGoala e){System.out.println("implementation.Stiva goala");}
//
//        System.out.println(stack);

        Stiva stack = null;
        try {
            stack = new Stiva(7);
        }catch (ExceptieConstructorStiva e){
            System.out.println(e.getMessage());
        }

        Citire InterfataCitire = new Citire();
        Afisare InterfataAfisare = new Afisare();

        for(int i = 0 ; i < 4 ; i++)
        {
            int tip = InterfataCitire.citireOptiuni();
            try{
                stack.addToStack(InterfataCitire.citireAtribute(tip));
            }
            catch (ExceptieAdaugareStiva e){System.out.println("Nu mai e loc e stiva");}
            catch (ExceptieObiectIdenticStiva e){System.out.println("Elementul " + ExceptieObiectIdenticStiva.getSameObj() + " este deja stocat");}
            catch (ExceptieObiectGresit e){System.out.println("Obiect gresit");}
        }

        try {
            System.out.println(stack.pop());
        }catch (ExceptieStivaGoala e){
            System.out.println("Stiva Goala");
        }

        System.out.println(stack);
    }
}
