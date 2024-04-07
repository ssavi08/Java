package Java.predrok1.zad9;
import java.text.DecimalFormat;
public class Radnik extends Osoba{

    static DecimalFormat ff = new DecimalFormat("0.00");

    private String radnikId;
    private double placa;

    Radnik(String ime, String prezime, String radnikId, double placa){
        super(ime,prezime);
        this.radnikId = radnikId;
        this.placa = placa;
    }

    public void setRadnikId(String id){
        this.radnikId = id;
    }
    public void setPlaca(double placa){
        this.placa = placa;
    }
    public String getRadnikId(){
        return radnikId;
    }
    public double getPlaca(){
        return placa;
    }

    public void postaviPlace(double postotak){
        setPlaca(placa + placa*(postotak/100));
    }
    public String toString(){
        System.out.println(getIme()+"-"+getPrezime()+"-"+getRadnikId()+"-"+ff.format(getPlaca()));
        return null;
    }
}
