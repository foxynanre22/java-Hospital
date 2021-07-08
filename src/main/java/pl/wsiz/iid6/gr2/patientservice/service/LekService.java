package pl.wsiz.iid6.gr2.patientservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wsiz.iid6.gr2.patientservice.dto.LekDTO;
import pl.wsiz.iid6.gr2.patientservice.entity.Lek;
import pl.wsiz.iid6.gr2.patientservice.jpa.LekRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LekService {
    @Autowired
    private LekRepository lekRepository;

    public LekDTO findById(Long Id){
        Optional<Lek> res = lekRepository.findById(Id);
        if(res.isPresent()){
            Lek lek = res.get();
            return new LekDTO(lek.getName(), lek.getProducent(), lek.getIlosc());
        }
        return new LekDTO("None", "None");
    }

    public String findByName(String name){
        List<Lek> res = lekRepository.findAllByName(name);

        return res.toString();
    }

    public List<Lek> findAll() {
        List<Lek> rs = lekRepository.findAll();
        return rs;
    }

}
