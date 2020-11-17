package microservices.Spring.Configurations.MongoClient;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;


import java.util.Collection;
import java.util.Collections;

@Configuration

public class Config  {

    @Bean
    protected String getDatabaseName(){
        return "appleapp";
    }

    @Bean
    public MongoClient mongoClient() {
        ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017/appleapp");
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();

        return MongoClients.create(mongoClientSettings);
    }

    @Bean
    public Collection getMappingBasePackages() {
        return Collections.singleton("com.baeldung");
    }
}
