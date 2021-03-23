package uz.pdp.task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.District;
import uz.pdp.task2.entity.Order;
import uz.pdp.task2.projection.CustomDistrict;
import uz.pdp.task2.projection.CustomOrder;

@RepositoryRestResource(path = "order", collectionResourceRel = "list", excerptProjection = CustomOrder.class)
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
