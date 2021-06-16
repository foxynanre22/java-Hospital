package pl.wsiz.iid6.gr2.patientservice.dto;

public class Lek {
    private String nazwa;
    private String producent;

    public Integer getIlosc() {
        return ilosc;
    }

    private Integer ilosc;

    public String getNazwa() {
        return nazwa;
    }

    public String getProducent() {
        return producent;
    }

    public Lek(String nazwa, String producent) {
        this.nazwa = nazwa;
        this.producent = producent;
    }
    public Lek(String nazwa, String producent, Integer ilosc) {
        this.nazwa = nazwa;
        this.producent = producent;
        this.ilosc = ilosc;
    }

    public Lek(String nazwa) {
        this.nazwa = nazwa;
    }
}
