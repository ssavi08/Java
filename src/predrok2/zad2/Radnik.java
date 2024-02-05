package predrok2.zad2;
import java.text.DecimalFormat;
public class Radnik extends Osoba{
    DecimalFormat ff = new DecimalFormat("0.00");
    private double placa;

    Radnik(String ime, String prezime, double placa){
        super(ime, prezime);
        setPlaca(placa);
    }

    public double getPlaca(){
        return placa;
    }
    public void setPlaca(double placa){
        this.placa = placa;
    }

    public boolean equals(Object radnik1){
        return radnik1.equals(ff.format(getPlaca()));
    }
}
