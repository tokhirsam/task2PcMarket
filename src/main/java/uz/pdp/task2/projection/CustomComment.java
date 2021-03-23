package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.Characteristics;
import uz.pdp.task2.entity.Comment;
import uz.pdp.task2.entity.Type;
import uz.pdp.task2.entity.User;

import javax.persistence.OneToOne;

@Projection(types = Comment.class)
public interface CustomComment {
   public Integer getId();
   public String getBody();
   public User getUser();





}
