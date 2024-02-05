package predrok1.zad9;

public class Osoba {
    private String ime;
    private String prezime;

    Osoba(String ime, String prezime){
        this.setIme(ime);
        this.setPrezime(prezime);
    }

    public void setIme(String ime){
        this.ime = ime;
    }
    public void setPrezime(String prezime){
        this.prezime = prezime;
    }
    public String getIme(){
        return ime;
    }
    public String getPrezime(){
        return prezime;
    }

    public String toString(){
        System.out.println(getIme()+"-"+getPrezime());
        return null;
    }
}
