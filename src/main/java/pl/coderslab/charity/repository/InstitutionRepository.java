package pl.coderslab.charity.repository;

import org.springframework.data.repository.CrudRepository;
import pl.coderslab.charity.model.Institution;

import java.util.List;

public interface InstitutionRepository extends CrudRepository<Institution, Integer> {

    List<Institution> findAll();
}
