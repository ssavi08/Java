package Java.predrok1.zad4;

public class Osoba {
    private String ime, prezime;

    Osoba(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }
    public String getIme() {
        return ime;
    }
    public void setIme(String ime){
        this.ime = ime;
    }
    public String getPrezime(){
        return prezime;
    }
    public void setPrezime(String prezime){
        this.prezime = prezime;
    }

    public String toString(){
        System.out.println(ime+"-"+prezime);
        return null;
    }

}
