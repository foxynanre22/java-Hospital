package pl.wsiz.iid6.gr2.patientservice.dto;

import java.time.LocalDate;

public class Skierowanie {
    private boolean czyZrealizowane;
    private Specjalista specjalista;
    private LocalDate dataWaznosci;

    public Skierowanie(boolean czyZrealizowane, Specjalista specjalista, LocalDate dataWaznosci) {
        this.czyZrealizowane = czyZrealizowane;
        this.specjalista = specjalista;
        this.dataWaznosci = dataWaznosci;
    }

    public void setCzyZrealizowane(boolean czyZrealizowane) {
        this.czyZrealizowane = czyZrealizowane;
    }

    public boolean getCzyZrealizowane() {
        return czyZrealizowane;
    }

    public Specjalista getSpecjalista() {
        return specjalista;
    }

    public LocalDate getDataWaznosci() {
        return dataWaznosci;
    }
}
