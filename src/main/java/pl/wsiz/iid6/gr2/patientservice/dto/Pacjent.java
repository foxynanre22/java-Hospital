package pl.wsiz.iid6.gr2.patientservice.dto;

import java.util.List;

public class Pacjent extends Osoba{
    private String nrUbezpieczenia;
    private Osoba lekarzRodinny;
    private List<Skierowanie> listaSkierowan;
    private List<Badanie> listaBadan;
    private Stan stanZdrowia;
    private List<Lek> leki;
    private List<Recepta> recepty;

    public Pacjent() {

    }
    public Pacjent(String imie, String nazwisko, String pesel) {
        super(imie,nazwisko,pesel);
    }

    public Pacjent(String imie, String nazwisko, String pesel, String nrUbezpieczenia) {
        super(imie,nazwisko,pesel);
        this.nrUbezpieczenia = nrUbezpieczenia;
    }

    public Pacjent(String imie, String nazwisko) {
        super(imie,nazwisko);
    }

    @Override
    public String toString(){
        return String.format( "Patient[firstName='%s', lastName='%s']", this.getImie(), this.getNazwisko());
    }
}
