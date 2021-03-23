package uz.pdp.task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.Product;
import uz.pdp.task2.entity.Region;
import uz.pdp.task2.projection.CustomProduct;
import uz.pdp.task2.projection.CustomRegion;

@RepositoryRestResource(path = "region", collectionResourceRel = "list", excerptProjection = CustomRegion.class)
public interface RegionRepository extends JpaRepository<Region, Integer> {
}
