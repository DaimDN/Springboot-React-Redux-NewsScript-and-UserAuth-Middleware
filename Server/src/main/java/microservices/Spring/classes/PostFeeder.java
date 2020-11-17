package microservices.Spring.classes;

import java.util.Date;

public class PostFeeder {

    public String title;
    public String time;
    public String description;
    public String Date;


    public PostFeeder(String s){}
    public PostFeeder(String title, String time, String description, String Date){

        this.title = title;
        this.time = time;
        this.description = description;
        this.Date = Date;

    }
}
