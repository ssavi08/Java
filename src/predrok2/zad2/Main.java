package predrok2.zad2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Radnik radnik1 = new Radnik("","",0.00000000);
        Radnik radnik2 = new Radnik("","", 0.00000000);

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        radnik1.setIme(sc1.nextLine());
        radnik1.setPrezime(sc1.nextLine());
        radnik1.setPlaca(sc1.nextDouble());

        radnik2.setIme(sc2.nextLine());
        radnik2.setPrezime(sc2.nextLine());
        radnik2.setPlaca(sc2.nextDouble());

        if(radnik1.equals(radnik2)){
            System.out.println("Isti su.");
        }else{
            System.out.println("Nisu isti.");
        }

    }
}
