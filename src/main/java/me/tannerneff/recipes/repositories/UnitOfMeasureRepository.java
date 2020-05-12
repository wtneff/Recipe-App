package me.tannerneff.recipes.repositories;

import me.tannerneff.recipes.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<Recipe, Long> {
}
