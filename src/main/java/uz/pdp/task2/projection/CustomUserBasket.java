package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.Address;
import uz.pdp.task2.entity.OutputProduct;
import uz.pdp.task2.entity.User;
import uz.pdp.task2.entity.UserBasket;

import javax.persistence.OneToMany;
import java.util.List;

@Projection(types = UserBasket.class)
public interface CustomUserBasket {
   public Integer getId();
   public User getUserId();
   public List<OutputProduct> getOutputProducts();









}
