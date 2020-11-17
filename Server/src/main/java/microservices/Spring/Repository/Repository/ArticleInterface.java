package microservices.Spring.Repository.Repository;

import microservices.Spring.Repository.Collections.article;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleInterface extends MongoRepository<article, String> {

}
