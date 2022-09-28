package pl.coderslab.charity.repository;

import org.springframework.data.repository.CrudRepository;
import pl.coderslab.charity.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
