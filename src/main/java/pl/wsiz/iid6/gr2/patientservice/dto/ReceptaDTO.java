package pl.wsiz.iid6.gr2.patientservice.dto;

import java.time.LocalDate;
import java.util.List;

public class ReceptaDTO {
    private int ID;
    private String peselPacjenta;
    private LocalDate dataWaznosci;
    private List<LekDTO> listaLekow;

    public int getID() {
        return ID;
    }

    public String getPeselPacjenta() {
        return peselPacjenta;
    }

    public LocalDate getDataWaznosci() {
        return dataWaznosci;
    }

    public List<LekDTO> getListaLekow() {
        return listaLekow;
    }

    public ReceptaDTO(int ID, String peselPacjenta, LocalDate dataWaznosci, List<LekDTO> listaLekow) {
        this.ID = ID;
        this.peselPacjenta = peselPacjenta;
        this.dataWaznosci = dataWaznosci;
        this.listaLekow = listaLekow;
    }

    public List<LekDTO> obtainListaLekow() {
        if(dataWaznosci.getMonthValue()+dataWaznosci.getDayOfMonth() <= LocalDate.now().getMonthValue()+LocalDate.now().getDayOfMonth()){
            return null;
        }else {
            return listaLekow;
        }
    }
}
