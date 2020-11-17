package microservices.Spring.Repository.Collections;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "articles")
public class article {

    public String title;
    public String description;
    public String ImageUrl;
    public String date;


    public article(String title, String description, String imageUrl, String date) {
        this.title = title;
        this.description = description;
        ImageUrl = imageUrl;
        this.date = date;
    }


}
