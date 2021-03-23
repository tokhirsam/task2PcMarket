package uz.pdp.task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.Category;
import uz.pdp.task2.entity.Characteristics;
import uz.pdp.task2.projection.CustomCategory;
import uz.pdp.task2.projection.CustomCharacteristics;

@RepositoryRestResource(path = "characteristics", collectionResourceRel = "list", excerptProjection = CustomCharacteristics.class)
public interface CharacteristicsRepository extends JpaRepository<Characteristics, Integer> {
}
