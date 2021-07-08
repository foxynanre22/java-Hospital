package pl.wsiz.iid6.gr2.patientservice.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.wsiz.iid6.gr2.patientservice.entity.Lek;
import pl.wsiz.iid6.gr2.patientservice.entity.Recepta;

import java.util.List;

@Repository
public interface ReceptaRepository extends CrudRepository<Recepta, Long> {
    List<Recepta> findAllByPeselPacjenta(String pesel);
    List<Recepta> findAll();
}
