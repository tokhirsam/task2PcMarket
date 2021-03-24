package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.Address;
import uz.pdp.task2.entity.District;
import uz.pdp.task2.entity.Detail;

@Projection(types = Detail.class)
public interface CustomDetail {
   public Integer getId();
   public String getValue();
}
