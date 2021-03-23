package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.Order;
import uz.pdp.task2.entity.OutputProduct;
import uz.pdp.task2.entity.Product;
import uz.pdp.task2.entity.UserBasket;

import java.util.Date;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
   public Integer getId();
   public Double getAmount();
   public Product getProductId();








}
