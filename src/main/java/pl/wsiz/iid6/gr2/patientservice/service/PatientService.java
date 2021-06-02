package pl.wsiz.iid6.gr2.patientservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wsiz.iid6.gr2.patientservice.dto.Pacjent;
import pl.wsiz.iid6.gr2.patientservice.entity.PatientEntity;
import pl.wsiz.iid6.gr2.patientservice.jpa.PatientRepository;

import javax.swing.text.html.Option;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Pacjent findById(Long Id){
        Optional<PatientEntity> res = patientRepository.findById(Id);
        if(res.isPresent()){
            PatientEntity pat = res.get();
            return new Pacjent(pat.getFirstName(), pat.getLastName(), pat.getPesel());
        }
        return new Pacjent("None", "None", "None");
    }

    public String findByLastName(String lastName){
        List<PatientEntity> res = patientRepository.findAllByLastName(lastName);

        return res.toString();
    }
}
