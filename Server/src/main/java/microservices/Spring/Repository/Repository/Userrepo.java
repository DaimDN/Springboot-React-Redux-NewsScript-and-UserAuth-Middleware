package microservices.Spring.Repository.Repository;

import microservices.Spring.Repository.Collections.user;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Userrepo extends MongoRepository<user, String> {


}
