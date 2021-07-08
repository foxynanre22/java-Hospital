package pl.wsiz.iid6.gr2.patientservice.jpa;
import org.springframework.data.repository.CrudRepository;
import pl.wsiz.iid6.gr2.patientservice.entity.Lek;

import java.util.List;
import java.util.Optional;

public interface LekRepository  extends CrudRepository<Lek, Long> {
    List<Lek> findAllByName(String name);
    List<Lek> findAll();

    @Override
    Optional<Lek> findById(Long aLong);
}
