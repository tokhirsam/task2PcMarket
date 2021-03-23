package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.Attachment;
import uz.pdp.task2.entity.District;
import uz.pdp.task2.entity.MyTeam;
import uz.pdp.task2.entity.Region;

import javax.persistence.OneToOne;

@Projection(types = MyTeam.class)
public interface CustomMyTeam {
   public Integer getId();
   public String getName();
   public String getOccupation();
   public Attachment getPhoto();





}
