package microservices.Spring.Controllers;

import javafx.geometry.Pos;
import microservices.Spring.classes.HomeManage;
import microservices.Spring.classes.PostFeeder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class UrlControllers {

    @CrossOrigin("http://localhost:3000")
    @GetMapping(name = "/")
    public HomeManage getName(){
        HomeManage msg = new HomeManage("Wecome to this application");
        return msg;
    }


}
