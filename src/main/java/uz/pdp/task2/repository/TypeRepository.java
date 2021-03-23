package uz.pdp.task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.Region;
import uz.pdp.task2.entity.Type;
import uz.pdp.task2.projection.CustomRegion;
import uz.pdp.task2.projection.CustomType;

@RepositoryRestResource(path = "type", collectionResourceRel = "list", excerptProjection = CustomType.class)
public interface TypeRepository extends JpaRepository<Type, Integer> {
}
