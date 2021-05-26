package pl.wsiz.iid6.gr2.patientservice.dto;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Pattern;

public class Osoba {
    private String imie;
    private String nazwisko;
    private String miejscowosc;
    private String kod;
    private String ulica;
    private String pesel;
    private LocalDate dataurodzenia;
    private String mail;
    private String nrTelefonu;
    // "k" dla kobiet oraz "m" dla mezczyzn
    private String plec;

    public int getWiek(){
        return Period.between(this.dataurodzenia, LocalDate.now()).getYears();
    }

    public boolean checkEmail(){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (this.mail == null)
            return false;
        return pat.matcher(this.mail).matches();
    }

    public boolean checkPesel(){
        String peselRegex =
                this.dataurodzenia.getYear()+
                this.dataurodzenia.getMonthValue() +
                this.dataurodzenia.getDayOfMonth()+ "^[0-9]{3}";

        if (plec == "k"){
            peselRegex += "[02468]$";
        }else if (plec == "m"){
            peselRegex += "[13579]$";
        }

        Pattern pat = Pattern.compile(peselRegex);
        if (this.pesel == null)
            return false;
        return pat.matcher(this.pesel).matches();
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public LocalDate getDataurodzenia() {
        return dataurodzenia;
    }

    public void setDataurodzenia(LocalDate dataurodzenia) {
        this.dataurodzenia = dataurodzenia;
    }
}
