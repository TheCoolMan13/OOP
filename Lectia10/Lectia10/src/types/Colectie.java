package types;

import java.util.ArrayList;

public class Colectie extends Tip{
    private ArrayList<Tip> colectie = new ArrayList<>();

    @Override
    public String getTip() {
        return "colectie";
    }

    @Override
    public String toString() {
        String rezultat = "(";

        for (Iterator iterator = new Iterator(0);
             iterator.getDateMembru() < colectie.size();
             iterator.increment()) {

            if (iterator.getDateMembru() > 0) {
                rezultat += ", ";
            }

            rezultat += colectie.get(iterator.getDateMembru()).toString();
        }

        rezultat += ")";
        return rezultat;
    }

    public void addElement(Tip tip)
    {
        colectie.add(tip);
    }

    public boolean equals(Object o)
    {
        if(o == null || o.getClass() != Colectie.class) {return false;}
        if(colectie.size() != ((Colectie)o).colectie.size()) {return false;}

        for(Iterator iterator = new Iterator(0); iterator.getDateMembru() < colectie.size() ; iterator.increment())
        {
            if(!colectie.get(iterator.getDateMembru()).equals(((Colectie) o).colectie.get(iterator.getDateMembru())))
            {return false;}
        }
        return true;
    }
}
