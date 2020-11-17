package microservices.Spring.Controllers.getAuthControllers;


import microservices.Spring.Controllers.PostAuthControllers.RegisterController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Controller
@RestController
public class userloginController {



    @GetMapping(path = "/get/users")
    @ResponseStatus(HttpStatus.OK)
    public ArrayList<Object> getuserinfo(){
        return RegisterController.array;
    }

}
