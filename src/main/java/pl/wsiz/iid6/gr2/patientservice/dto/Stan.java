package pl.wsiz.iid6.gr2.patientservice.dto;

public enum Stan {
    zdrowy(true), gospitalizacja(false), obserwacja (true);
    boolean czyOK;

    Stan(boolean czyOK) {
        this.czyOK = czyOK;
    }
}
