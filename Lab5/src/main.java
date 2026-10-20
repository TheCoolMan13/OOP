package src;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");

//        telefon telefon1 = new telefon("Ana");
//        telefon telefon2 = new telefon("Bob");
//        System.out.println(telefon1.toString());
//        System.out.println(telefon2.toString());
//
//
//        telefon1.apeleaza(telefon2);
//        telefon1.apeleaza(telefon2);
//        telefon1.apeleaza(telefon2);
//        System.out.println(telefon1.toString());
//        System.out.println(telefon2.toString());
//
//        System.out.println("Numar de apeluri de la Bob: " + telefon1.numarDeApeluri("Bob"));
//        System.out.println("Numar de apeluri de la Ana: " + telefon1.numarDeApeluri("Ana"));


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Introduceti numarul de telefoane: ");
        int nrTelefoane = scanner.nextInt();
        scanner.nextLine();
        telefon[] telefoane = new telefon[nrTelefoane];

        for(int i = 0 ; i < nrTelefoane ; i++)
        {
            System.out.println("Numele proprietar :");
            String nume = scanner.nextLine();
            telefoane[i] = new telefon(nume);
        }

        System.out.println("Introduceti numarul de apeluri: ");
        int nrApeluri = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0 ; i<nrApeluri; i++)
        {
            int x , y;
            x = random.nextInt(nrTelefoane);
            y = random.nextInt(nrTelefoane);
            while (x == y)
            {
                x = random.nextInt(nrTelefoane);
                y = random.nextInt(nrTelefoane);
            }
            telefoane[x].apeleaza(telefoane[y]);
        }

        System.out.println("verificare :");
        String numeVerif = scanner.nextLine();
        for (int i = 0 ; i < telefoane.length; i++)
        {
            System.out.println(telefoane[i].toString());
            System.out.println("Nr apeluri de la " + numeVerif + " =" + telefoane[i].numarDeApeluri(numeVerif));
        }
        scanner.close();
    }
}
