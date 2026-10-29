import java.util.ArrayList;

public class Tarc {
    private Animal[] animals = new Animal[100];
    private int cnt;
    public void addAnimal(Animal a){
        if(cnt < 100)
        {
            animals[cnt++] = a;
        }
    }
}
// tac1.addAnimal(Vaca)