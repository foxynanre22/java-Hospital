package pl.wsiz.iid6.gr2.patientservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wsiz.iid6.gr2.patientservice.dto.PacjentDTO;
import pl.wsiz.iid6.gr2.patientservice.entity.Pacjent;
import pl.wsiz.iid6.gr2.patientservice.jpa.PacjentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PacjentService {
    @Autowired
    private PacjentRepository pacjentRepository;

    public PacjentDTO findById(Long Id){
        Optional<Pacjent> res = pacjentRepository.findById(Id);
        if(res.isPresent()){
            Pacjent pat = res.get();
            return new PacjentDTO(pat.getFirstName(), pat.getLastName(), pat.getPesel());
        }
        return new PacjentDTO("None", "None", "None");
    }

    public String findByLastName(String lastName){
        List<Pacjent> res = pacjentRepository.findAllByLastName(lastName);

        return res.toString();
    }

    public List<Pacjent> findAll() {
        List<Pacjent> rs = pacjentRepository.findAll();
        return rs;
    }
}
