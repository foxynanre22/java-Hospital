package pl.wsiz.iid6.gr2.patientservice.dto;

import java.time.LocalDate;
import java.util.List;

public class Recepta {
    private int ID;
    private String peselPacjenta;
    private LocalDate dataWaznosci;
    private List<Lek> listaLekow;

    public int getID() {
        return ID;
    }

    public String getPeselPacjenta() {
        return peselPacjenta;
    }

    public LocalDate getDataWaznosci() {
        return dataWaznosci;
    }

    public List<Lek> getListaLekow() {
        return listaLekow;
    }

    public Recepta(int ID, String peselPacjenta, LocalDate dataWaznosci, List<Lek> listaLekow) {
        this.ID = ID;
        this.peselPacjenta = peselPacjenta;
        this.dataWaznosci = dataWaznosci;
        this.listaLekow = listaLekow;
    }

    public List<Lek> obtainListaLekow() {
        if(dataWaznosci.getMonthValue()+dataWaznosci.getDayOfMonth() <= LocalDate.now().getMonthValue()+LocalDate.now().getDayOfMonth()){
            return null;
        }else {
            return listaLekow;
        }
    }
}
