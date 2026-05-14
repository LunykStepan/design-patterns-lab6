package lab6;
import javax.inject.Inject;

public class AuthService {
    @Inject // Dagger автоматично створить цей об'єкт
    public AuthService() {} 
    public String getAuthStatus() { return "User Authenticated"; }
}