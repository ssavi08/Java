package dodatniZad.zad2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Brojac brojac = new Brojac(n);
        brojac.start();
    }
}
