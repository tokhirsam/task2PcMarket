package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.Address;
import uz.pdp.task2.entity.District;

import javax.persistence.ManyToOne;

@Projection(types = Address.class)
public interface CustomAddress {
   public Integer getId();
   public String getStreet();
   public String getHomeNumber();
   public District getDistrict();
}
