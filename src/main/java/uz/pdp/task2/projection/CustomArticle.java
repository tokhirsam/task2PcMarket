package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.Address;
import uz.pdp.task2.entity.Article;
import uz.pdp.task2.entity.Attachment;
import uz.pdp.task2.entity.District;

@Projection(types = Article.class)
public interface CustomArticle {
   public Integer getId();
   public String getTitle();
   public String getDescription();
   public String getUrl_link();
   public Attachment getAttachment();
}
