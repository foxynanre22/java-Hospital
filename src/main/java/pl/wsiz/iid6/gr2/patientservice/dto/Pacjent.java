package pl.wsiz.iid6.gr2.patientservice.dto;

import java.util.List;

public class Pacjent extends Osoba{
    private int nrUbezpieczenia;
    private Osoba lekarzRodinny;
    private List<Skierowanie> listaSkierowan;
    private List<Badanie> listaBadan;
    private Stan stanZdrowia;
    private List<Lek> leki;
    private List<Recepta> recepty;

}
