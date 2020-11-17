package microservices.Spring.Controllers;

import microservices.Spring.classes.RegisterUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class RegisterController {

    @CrossOrigin("http://localhost:5000")
    @PostMapping(path = "/register", consumes = "application/json", produces = "application/json")
    RegisterUser register(@RequestBody RegisterUser register){
        return register;
    }
}
