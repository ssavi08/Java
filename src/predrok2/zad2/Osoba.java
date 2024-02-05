package predrok2.zad2;

public class Osoba {
    private String ime;
    private String prezime;

    public Osoba(String ime, String prezime){
        setIme(ime);
        setPrezime(prezime);
    }

    public String getIme(){
        return ime;
    }
    public String getPrezime(){
        return prezime;
    }
    public void setIme(String ime){
        this.ime = ime;
    }
    public void setPrezime(String prezime){
        this.prezime = prezime;
    }
}
