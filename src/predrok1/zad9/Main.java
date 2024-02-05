package predrok1.zad9;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Radnik rad = new Radnik("","","",0.00);
        Osoba oso = new Osoba("","");

        rad.setIme(input.nextLine());
        rad.setPrezime(input.nextLine());
        rad.setRadnikId(input.nextLine());
        rad.setPlaca(input.nextDouble());
        rad.postaviPlace(input.nextInt());

        rad.toString();
        oso.toString();
    }
}
