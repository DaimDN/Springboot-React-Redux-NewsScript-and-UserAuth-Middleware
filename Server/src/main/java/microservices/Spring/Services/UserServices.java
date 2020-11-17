package microservices.Spring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    /**
     *
     * @Daim
     * @Autowiring the Password Encoding dependency
     * */
    @Autowired
    private PasswordEncoder passwordEncoder;




}
