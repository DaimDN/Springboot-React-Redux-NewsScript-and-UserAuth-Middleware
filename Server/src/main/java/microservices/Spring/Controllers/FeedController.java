package microservices.Spring.Controllers;


import javafx.geometry.Pos;
import microservices.Spring.classes.AddFeed;
import microservices.Spring.classes.PostFeeder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

@RestController
@Controller

@CrossOrigin(origins = "http://localhost:3000")
public class FeedController {

   ArrayList<Object> array = new ArrayList<>();


    @CrossOrigin(origins = "http://localhost:5000")
    @GetMapping("/api/v1")
    public ArrayList<Object> getFeeds(){
        return array;
    }


    @PostMapping(path = "/register", consumes = "application/json", produces = "application/json")
    PostFeeder postfeeder(@RequestBody PostFeeder postfeeder){
        Date date = new Date();
        long time = date.getTime();
        String newdate = date.toLocaleString();
        String dates = Objects.toString(time, null);
        postfeeder.time = dates;
        postfeeder.Date = newdate;

        array.add(postfeeder);

        return postfeeder;
    }




}
