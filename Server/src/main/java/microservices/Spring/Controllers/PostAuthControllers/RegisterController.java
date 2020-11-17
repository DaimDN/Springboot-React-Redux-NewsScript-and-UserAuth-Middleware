package microservices.Spring.Controllers.PostAuthControllers;

import microservices.Spring.classes.RegisterUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
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


    @CrossOrigin("http://localhost:5000")
    @ResponseStatus(HttpStatus.OK)
    @PostMapping(path = "/register", consumes = "application/json", produces = "application/json")
    RegisterUser register(@RequestBody RegisterUser register){
        register.setPassword(passwordEncoder.encode(register.getPassword()));
        array.add(register);
        return register;
    }
}
