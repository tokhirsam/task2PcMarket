package uz.pdp.task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.District;
import uz.pdp.task2.entity.MyTeam;
import uz.pdp.task2.projection.CustomDistrict;
import uz.pdp.task2.projection.CustomMyTeam;

@RepositoryRestResource(path = "myTeam", collectionResourceRel = "list", excerptProjection = CustomMyTeam.class)
public interface MyTeamRepository extends JpaRepository<MyTeam, Integer> {
}
