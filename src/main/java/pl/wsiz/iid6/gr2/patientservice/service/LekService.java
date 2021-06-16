package pl.wsiz.iid6.gr2.patientservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wsiz.iid6.gr2.patientservice.dto.Lek;
import pl.wsiz.iid6.gr2.patientservice.entity.LekEntity;
import pl.wsiz.iid6.gr2.patientservice.jpa.LekRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LekService {
    @Autowired
    private LekRepository lekRepository;

    public Lek findById(Long Id){
        Optional<LekEntity> res = lekRepository.findById(Id);
        if(res.isPresent()){
            LekEntity lek = res.get();
            return new Lek(lek.getName(), lek.getProducent(), lek.getIlosc());
        }
        return new Lek("None", "None");
    }

    public String findByName(String name){
        List<LekEntity> res = lekRepository.findAllByName(name);

        return res.toString();
    }

    public List<LekEntity> findAll() {
        List<LekEntity> rs = lekRepository.findAll();
        return rs;
    }

}
