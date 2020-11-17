package microservices.Spring.Controllers.PostAuthControllers;


import microservices.Spring.classes.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class LoginController {

    @CrossOrigin("http://localhost:5000")
    @PostMapping(path = "/login", consumes = "application/json", produces = "application/json")
    Login login(@RequestBody Login login){
        return login;
    }

}
