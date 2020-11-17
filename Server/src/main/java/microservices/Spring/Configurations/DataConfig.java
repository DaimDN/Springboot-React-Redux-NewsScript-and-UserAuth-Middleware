package microservices.Spring.Configurations;


import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration()
public class DataConfig {


    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }
}
