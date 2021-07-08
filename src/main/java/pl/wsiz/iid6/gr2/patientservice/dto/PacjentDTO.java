package pl.wsiz.iid6.gr2.patientservice.dto;

import java.util.List;

public class PacjentDTO extends Osoba{
    private String nrUbezpieczenia;
    private Osoba lekarzRodinny;
    private List<LekDTO> leki;
    private List<ReceptaDTO> recepty;

    public PacjentDTO() {

    }
    public PacjentDTO(String imie, String nazwisko, String pesel) {
        super(imie,nazwisko,pesel);
    }

    public PacjentDTO(String imie, String nazwisko, String pesel, String nrUbezpieczenia) {
        super(imie,nazwisko,pesel);
        this.nrUbezpieczenia = nrUbezpieczenia;
    }

    public PacjentDTO(String imie, String nazwisko) {
        super(imie,nazwisko);
    }

    @Override
    public String toString(){
        return String.format( "Patient[firstName='%s', lastName='%s']", this.getImie(), this.getNazwisko());
    }
}
