package pl.wsiz.iid6.gr2.patientservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wsiz.iid6.gr2.patientservice.entity.Lek;
import pl.wsiz.iid6.gr2.patientservice.entity.Recepta;
import pl.wsiz.iid6.gr2.patientservice.jpa.ReceptaRepository;

import java.util.List;

@Service
public class ReceptaService {
    @Autowired
    private ReceptaRepository receptaRepository;

    public List<Recepta> findAll() {
        List<Recepta> rs = receptaRepository.findAll();
        return rs;
    }

    public List<Recepta> findAllByPesel(String pesel){
        List<Recepta> res = receptaRepository.findAllByPeselPacjenta(pesel);
        return res;
    }
}
