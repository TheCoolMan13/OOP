public class Main {
    public static void main(String[] args)
    {
//        System.out.println("main");
        Animal animal1 = new Animal(1 , "a" , 2);
        Animal animal2 = new Animal(1 , "a" , 2);

        Object o = new Object();

        animal1.zbiara();
        System.out.println(animal1.equals(animal2));
    }
}



/*
    Animal
__}___null____{__


    Animal
__}[greutate=0][nume=null][varsta=0]{__

 */