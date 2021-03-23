package uz.pdp.task2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String model;
    private String description;
    private Double price;
    private boolean active;
    @ManyToOne
    private Category categoryId;
    @OneToOne
    private  Attachment attachmentId;
    @OneToMany
    private List<Comment> comments;
    @OneToMany
    private List<Characteristics> characteristics;

}
