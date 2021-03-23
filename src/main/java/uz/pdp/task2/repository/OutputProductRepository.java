package uz.pdp.task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.Order;
import uz.pdp.task2.entity.OutputProduct;
import uz.pdp.task2.projection.CustomOrder;
import uz.pdp.task2.projection.CustomOutputProduct;

@RepositoryRestResource(path = "outputProduct", collectionResourceRel = "list", excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {
}
