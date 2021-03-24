package uz.pdp.task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.Detail;
import uz.pdp.task2.projection.CustomDetail;
import uz.pdp.task2.projection.CustomUser;
import uz.pdp.task2.projection.CustomDetail;

@RepositoryRestResource(path = "detail", collectionResourceRel = "list", excerptProjection = CustomDetail.class)
public interface DetailRepository extends JpaRepository<Detail, Integer> {
}
