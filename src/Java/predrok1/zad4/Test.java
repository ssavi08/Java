package Java.predrok1.zad4;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Test{
    static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Radnik radnik = new Radnik("","","", 0.00);
        radnik.setIme(input.nextLine());
        radnik.setPrezime(input.nextLine());
        radnik.setRadnikId(input.nextLine());
        radnik.setPlaca(input.nextDouble());
        radnik.postaviPlacu(input.nextDouble());

        System.out.println(radnik.getIme()+"-"+radnik.getPrezime()+"-"+radnik.getRadnikId()+"-"+df.format(radnik.getPlaca()));
    }
}
