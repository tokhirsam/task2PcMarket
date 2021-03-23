package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.Comment;
import uz.pdp.task2.entity.District;
import uz.pdp.task2.entity.Region;
import uz.pdp.task2.entity.User;

@Projection(types = District.class)
public interface CustomDistrict {
   public Integer getId();
   public String getName();
   public Region getRegion();





}
