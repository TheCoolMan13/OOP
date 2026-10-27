public class Main{
    public static void main(String [] args)
    {
        //System.out.println("JAva work");
        //Avion avion1 = new Avion();
        Boeing boeing1 = new Boeing("AAA" , 199,100);
        System.out.println(boeing1.getMaxPassengers());
        Concorde concorde1 = new Concorde("BBB" ,300,100);
        concorde1.goSuperSonic();
        Mig mig1 = new Mig("CCC" ,3000);
        mig1.launchMissle();
        TomCat tomCat1 = new TomCat("DDD",2000);
        tomCat1.refuel();
    }
}