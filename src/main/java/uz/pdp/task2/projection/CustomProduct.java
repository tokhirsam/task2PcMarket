package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.*;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Date;
import java.util.List;

@Projection(types = Product.class)
public interface CustomProduct {
   public Integer getId();
   public String getName();
   public String getModel();
   public String getDescription();
   public Double getPrice();
   public boolean getActive();
   public Category getCategoryId();
   public Attachment getAttachmentId();
   public List<Comment> getComments();
   public List<Characteristics> getCharacteristics();








}
