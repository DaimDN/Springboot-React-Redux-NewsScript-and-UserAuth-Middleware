package microservices.Spring.Controllers.PostAuthControllers;

import microservices.Spring.Repository.Collections.user;
import microservices.Spring.Repository.Repository.Userrepo;
import microservices.Spring.classes.RegisterUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

@Controller
@RestController
public class RegisterController {
    public static ArrayList<Object> array = new ArrayList<>();
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private Userrepo userrepo;

    @CrossOrigin("http://localhost:5000")
    @ResponseStatus(HttpStatus.OK)
    @PostMapping(path = "/register", consumes = "application/json", produces = "application/json")
    user USER(@RequestBody user USER){
        USER.setPassword(passwordEncoder.encode(USER.getPassword()));
        userrepo.save(USER);
        return USER;
    }
}
