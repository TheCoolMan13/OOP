package src;

public class telefon {
    private String proprietar;
    private String[] contacte = new String[100];
    private int cnt;

    public telefon(String proprietar) {
        this.proprietar = proprietar;
    }
    public String toString()
    {
        String aux = "" + proprietar + " Contactat de :";
        for(int i = 0 ; i < cnt ; i++)
        {
            aux += " " + contacte[i];
        }
        return aux;
    }
    public Integer numarDeApeluri(String numeApelant)
    {
           Integer apel = 0;
           for(int i = 0 ; i < cnt ; i++)
           {
               if(numeApelant.equals(contacte[i]))
               {
                   apel++;
               }
           }
           return  apel;
    }
    public String getProprietar()
    {
        return proprietar;
    }
    public boolean apeleaza(telefon t)
    {
        if(cnt < 100)
        {
            t.contacte[t.cnt] = this.proprietar;
            t.cnt++;
            return true;
        }
        return false;
    }
}
