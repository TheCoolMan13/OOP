package implementation;

public class Cerc extends Figura{
    private int oX;
    private int oY;
    private int radius;

    public Cerc(int oX, int oY, int radius)
    {
        this.oX = oX;
        this.oY = oY;
        this.radius = radius;
    }
    public String toString()
    {
        return "implementation.Cerc: " + "Ox:"+ oX +" Oy:" + oY +" raza:" + radius;
    }
    public boolean equals(Object o)
    {
        if(o instanceof Cerc)
        {
            if((this.oX == ((Cerc) o).oX) && (this.oY == ((Cerc)o).oY ) && (this.radius == ((Cerc) o).radius)  )
                return true;
        }
        return false;
    }
}
