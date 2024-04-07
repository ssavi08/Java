package Java.predrok1.zad5;
public class MojaNit extends Thread {

    String imeNiti;
    private String rijeci;

    public MojaNit(String imeNiti, String rijeci){
        this.imeNiti = imeNiti;
        this.rijeci = rijeci;
    }

    @Override
    public void run(){
        char slovo = 0;
        int suma = 0;
        for(int i=0; i<rijeci.length(); i++){
            slovo = rijeci.charAt(i);
            suma += slovo;
        }
        System.out.println(suma);
    }
}
