package microservices.Spring.Controllers.PostAuthControllers;


import microservices.Spring.Repository.Collections.article;
import microservices.Spring.Repository.Repository.ArticleInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller

public class PostArticles {

    @Autowired
    ArticleInterface articles;

    @CrossOrigin("http://localhost:5000")
    @PostMapping(name = "/new", consumes = "application/json", produces = "application/json")
    article Article(@RequestBody article Article){


        return Article;

    }
}
