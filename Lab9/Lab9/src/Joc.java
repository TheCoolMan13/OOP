public class Joc {
    private String echipa1;
    private String echipa2;
    private int nrGoalEchipa1;
    private int nrGoalEchipa2;
    private int nrCorner;
    private int nrOut;

    public Joc(String echipa1, String echipa2)
    {
        this.echipa1 = echipa1;
        this.echipa2 = echipa2;
    }

    public void simuleaza()
    {
        Minge minge = new Minge();
        Minge oldMinge = new Minge();
        for(int i = 0 ; i <1000 ; i++) {
            try {
                oldMinge = new Minge(minge.getX() , minge.getY());
                minge.suteaza();
            }
            catch (ExceptieOut e) {
                System.out.println("Out");
                minge = oldMinge;
            }
            catch (ExceptieCorner e){
                System.out.println("CORNER");

                /*Conditii in care se ajunge la corner
                if((x == 0 || x == 100) && ((y>=0 && y<=20) || (y>=30 && y <=100)))*/

                if(minge.getY() <= 20)
                {minge.setY(0);}
                if(minge.getY() >=30)
                {minge.setY(100);}

            }
            catch (ExceptieGoalEchipa1 e){
                System.out.println("GOAL ECHIPA: " + echipa1);
                minge = new Minge(50, 25);
            }
            catch (ExceptieGoalEchipa2 e){
                System.out.println("GOAL ECHIPA: "+ echipa2);
                minge = new Minge(50 , 25);
            }
        }
        nrOut = ExceptieOut.getInstanceNo();
        nrCorner = ExceptieCorner.getInstanceNo();
        nrGoalEchipa1 = ExceptieGoalEchipa1.getInstanceNo();
        nrGoalEchipa2 = ExceptieGoalEchipa2.getInstanceNo();
    }

    public String toString()
    {
        return echipa1 +":" + nrGoalEchipa1+ " " + echipa2 +":" + nrGoalEchipa2 + " out:" + nrOut + " corner:"+ nrCorner;
    }
    public static void main(String[] args)
    {
        Joc joc = new Joc("FCSB" , "POLITm");
        joc.simuleaza();
        System.out.println(joc);
    }
}
