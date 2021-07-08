package pl.wsiz.iid6.gr2.patientservice.jpa;

import org.springframework.data.repository.CrudRepository;
import pl.wsiz.iid6.gr2.patientservice.entity.Pacjent;

import java.util.List;
import java.util.Optional;

public interface PacjentRepository extends CrudRepository<Pacjent, Long> {
    List<Pacjent> findAllByLastName(String lastName);
    List<Pacjent> findAll();

    @Override
    Optional<Pacjent> findById(Long aLong);
}
