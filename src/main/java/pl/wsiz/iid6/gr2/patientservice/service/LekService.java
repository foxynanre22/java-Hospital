package pl.wsiz.iid6.gr2.patientservice.service;

import org.springframework.stereotype.Service;
import pl.wsiz.iid6.gr2.patientservice.dto.Lek;

@Service
public class LekService {
    private Lek[] leki = {
            new Lek("Nazwa1","Producent1"),
            new Lek("Nazwa2","Producent2"),
            new Lek("Nazwa3","Producent3")
    };

    public Lek findLek(String nazwa){
        for (Lek lek : leki){
            if(lek.getNazwa().equals(nazwa)){
                return lek;
            }
        }
        return new Lek(nazwa);
    }

    public String getAllLeki(){
        String tmp = "Lek - Producent\n";
        for (Lek lek : leki){
            tmp += lek.getNazwa() + " - " + lek.getProducent() + "\n";
        }
        return tmp;
    }

}
