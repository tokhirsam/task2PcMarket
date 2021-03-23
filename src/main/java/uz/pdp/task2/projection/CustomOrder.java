package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.District;
import uz.pdp.task2.entity.Order;
import uz.pdp.task2.entity.Region;
import uz.pdp.task2.entity.UserBasket;

import javax.persistence.OneToOne;
import java.util.Date;

@Projection(types = Order.class)
public interface CustomOrder {
   public Integer getId();
   public String getDetails();
   public Date getDate();
   public UserBasket getBasket();







}
