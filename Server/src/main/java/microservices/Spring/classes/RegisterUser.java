package microservices.Spring.classes;



public class RegisterUser {

    public String firstname;
    public String lastname;
    public String email;
    public String password;
    public String DOB;

    public RegisterUser(String firstname, String lastname, String email, String password, String DOB) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.DOB = DOB;
    }
}
