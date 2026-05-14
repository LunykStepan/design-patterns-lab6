package lab6;

import javax.inject.Inject;

public class Controller {
    private final Repository repo;
    private final Database db;
    private final AuthService auth;

    @Inject
    public Controller(Repository repo, Database db, AuthService auth) {
        this.repo = repo;
        this.db = db;
        this.auth = auth;
    }

    public void start() {
        repo.log();
        System.out.println("Direct DB check: " + db.getStatus());
        System.out.println("Direct Auth check: " + auth.getAuthStatus());
        System.out.println("Controller: System check completed.");
    }
}