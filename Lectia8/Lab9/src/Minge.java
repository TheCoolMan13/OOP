public class Minge {
    private int x;
    private int y;
    private CoordinateGenerator generator = new CoordinateGenerator();

    public Minge(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Minge() {
        this.x = 50;
        this.y = 25;
    }

    public String toString() {
        return x + " " + y;
    }

    public int getX()
    {return x;}
    public void setX(int x)
    {this.x = x;}

    public int getY()
    {return y;}
    public void setY(int y)
    {this.y = y;}

    public void suteaza ()
        throws ExceptieOut, ExceptieGoalEchipa1, ExceptieCorner,ExceptieGoalEchipa2 {
        this.x  = generator.generateX();
        this.y = generator.generateY();

        if(y == 0 || y ==50)
            throw new ExceptieOut("OUT");
        if((x == 0) && (y>=20 && y<=30))
            throw new ExceptieGoalEchipa1("GOAL ech1");
        if((x == 100) && (y>=20 && y<=30))
            throw new ExceptieGoalEchipa2("GOAL ech2");
        if((x == 0 || x == 100) && ((y>=0 && y<=20) || (y>=30 && y <=100)))
            throw new ExceptieCorner("CORNER");
    }


}
