package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.Article;
import uz.pdp.task2.entity.Attachment;
import uz.pdp.task2.entity.Category;

@Projection(types = Category.class)
public interface CustomCategory {
   public Integer getId();
   public String getName();
   public Category getParentCategory();

}
