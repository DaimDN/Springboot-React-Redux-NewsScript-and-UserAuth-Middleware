package microservices.Spring.Controllers.PostAuthControllers;


import microservices.Spring.Repository.Repository.Userrepo;
import microservices.Spring.classes.HomeManage;
import microservices.Spring.classes.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.scheduling.annotation.Async;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.management.Query;
import java.util.ArrayList;
import java.util.List;

@Controller
@RestController
public class LoginController {

    @Autowired
    private Userrepo userrepo;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @CrossOrigin("http://localhost:5000")
    @PostMapping(path = "/login", consumes = "application/json", produces = "application/json")
    Login login(@RequestBody Login login){
        login.setPassword(passwordEncoder.encode(login.getPassword()));

      return login;
    }
    @CrossOrigin
    @GetMapping(path = "/users", produces = "application/json")
    @Async
    public Object dataset (){
       Object data=  userrepo.findAllByA();
       return data;

    }


    @GetMapping(path = "*")
    public Object getError(){
        HomeManage home = new HomeManage("Error Page doesnt exit");
        return home;
    }




}
