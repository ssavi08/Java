package Java.predrok2.zad3;
public class Nit extends Thread{
    String ime;
    String recenica;

    Nit(String ime, String recenica){
        this.ime = ime;
        this.recenica = recenica;
    }

    public void run(){
        String[] rijec = recenica.split("\\s++");
        int broj = 0;
        for(String x : rijec){
            if(x.charAt(0)=='a' || x.charAt(0)=='e'|| x.charAt(0)=='i'|| x.charAt(0)=='o'|| x.charAt(0)=='u'){
                broj++;
            }
        }
        System.out.println(ime+ " "+ broj);
    }
}
