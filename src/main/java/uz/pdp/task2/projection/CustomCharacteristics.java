package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.Category;
import uz.pdp.task2.entity.Characteristics;
import uz.pdp.task2.entity.Type;

import javax.persistence.OneToOne;

@Projection(types = Characteristics.class)
public interface CustomCharacteristics {
   public Integer getId();
   public String getName();
   public Type getType();


}
