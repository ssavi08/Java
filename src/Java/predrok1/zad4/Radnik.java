package Java.predrok1.zad4;

public class Radnik extends Osoba{

    String radnikId;
    double placa, x;

    Radnik(String ime, String prezime, String radnikId, double placa){
        super(ime, prezime);
        this.radnikId = radnikId;
        this.placa = placa;
    }

    public String getRadnikId(){
        return radnikId;
    }
    public void setRadnikId(String radnikId){
        this.radnikId = radnikId;
    }

    public double getPlaca(){
        return placa;
    }
    public void setPlaca(double placa){
        this.placa = placa;
    }

    public String toString(){
        System.out.println(getIme()+"-"+getPrezime()+"-"+radnikId+"-"+placa);
        return null;
    }

    public void postaviPlacu(double postotak){
        setPlaca(placa + placa*(postotak/100));
    }
}
