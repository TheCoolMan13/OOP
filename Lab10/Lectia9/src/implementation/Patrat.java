package implementation;

public class Patrat extends Figura{
    private int oX;
    private int oY;
    private int pX;
    private int pY;

    public Patrat(int oX , int oY , int pX , int pY)
    {
        this.oX = oX;
        this.oY = oY;
        this.pX = pX;
        this.pY = pY;
    }
    // A = (pY - oY)^2
    public String toString()
    {
        return "implementation.Patrat: (" + oX + "," + oY + ") (" + pX +","+ pY + ")";
    }
    public boolean equals(Object o)
    {
        if(o instanceof Patrat)
        {
            return ((this.pY - this.oY) == (((Patrat) o).pY - ((Patrat) o).oY));
        }
        return false;
    }
}
