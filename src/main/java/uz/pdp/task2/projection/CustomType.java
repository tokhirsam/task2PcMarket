package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.Region;
import uz.pdp.task2.entity.Type;

@Projection(types = Type.class)
public interface CustomType {
   public Integer getId();
   public String getName();








}
