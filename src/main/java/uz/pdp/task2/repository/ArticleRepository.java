package uz.pdp.task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.Address;
import uz.pdp.task2.entity.Article;
import uz.pdp.task2.projection.CustomAddress;
import uz.pdp.task2.projection.CustomArticle;

@RepositoryRestResource(path = "article", collectionResourceRel = "list", excerptProjection = CustomArticle.class)
public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
