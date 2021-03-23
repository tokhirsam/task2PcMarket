package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.Address;
import uz.pdp.task2.entity.Type;
import uz.pdp.task2.entity.User;

import javax.persistence.OneToOne;

@Projection(types = User.class)
public interface CustomUser {
   public Integer getId();
   public String getFullName();
   public String getEmail();
   public String getPassword();
   public Address getAddress();










}
