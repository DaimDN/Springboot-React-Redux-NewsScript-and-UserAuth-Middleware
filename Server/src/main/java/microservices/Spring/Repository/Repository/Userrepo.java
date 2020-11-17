package microservices.Spring.Repository.Repository;

import microservices.Spring.Repository.Collections.user;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Userrepo extends MongoRepository<user, String> {

   List findAllByEmail(String email);



    @Query(value="{}",fields="{ 'firstname' : 1, 'lastname' : 1, 'email': 1, 'DOB': 1}")
    List<user> findAllByA();



}
