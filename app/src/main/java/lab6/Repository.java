package lab6;
import javax.inject.Inject;

public class Repository {
    private final Database db;
    private final AuthService auth;

    @Inject // Dagger передасть сюди залежності
    public Repository(Database db, AuthService auth) {
        this.db = db;
        this.auth = auth;
    }

    public void log() {
        System.out.println(db.getStatus() + " | " + auth.getAuthStatus());
    }
}