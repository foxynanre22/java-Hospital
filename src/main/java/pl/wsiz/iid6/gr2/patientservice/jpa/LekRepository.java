package pl.wsiz.iid6.gr2.patientservice.jpa;
import org.springframework.data.repository.CrudRepository;
import pl.wsiz.iid6.gr2.patientservice.entity.LekEntity;

import java.util.List;
import java.util.Optional;

public interface LekRepository  extends CrudRepository<LekEntity, Long> {
    List<LekEntity> findAllByName(String name);
    List<LekEntity> findAll();

    @Override
    Optional<LekEntity> findById(Long aLong);
}
