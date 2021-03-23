package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.Order;
import uz.pdp.task2.entity.Region;
import uz.pdp.task2.entity.UserBasket;

import java.util.Date;

@Projection(types = Region.class)
public interface CustomRegion {
   public Integer getId();
   public String getName();








}
