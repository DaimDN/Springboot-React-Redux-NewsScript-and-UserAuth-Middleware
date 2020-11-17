package microservices.Spring.Repository.Collections;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collation = "user")
public class user {

    @Id
    private String id;

    private String firstname;

    private String lastname;

    @Indexed(unique = true)
    private String email;
    private String password;
    private String DOB;

    public void setPassword(String password) {
        this.password = password;
    }
}
