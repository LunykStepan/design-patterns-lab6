package lab6;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Controller_Factory implements Factory<Controller> {
  private final Provider<Repository> repoProvider;

  private final Provider<Database> dbProvider;

  private final Provider<AuthService> authProvider;

  public Controller_Factory(
      Provider<Repository> repoProvider,
      Provider<Database> dbProvider,
      Provider<AuthService> authProvider) {
    this.repoProvider = repoProvider;
    this.dbProvider = dbProvider;
    this.authProvider = authProvider;
  }

  @Override
  public Controller get() {
    return provideInstance(repoProvider, dbProvider, authProvider);
  }

  public static Controller provideInstance(
      Provider<Repository> repoProvider,
      Provider<Database> dbProvider,
      Provider<AuthService> authProvider) {
    return new Controller(repoProvider.get(), dbProvider.get(), authProvider.get());
  }

  public static Controller_Factory create(
      Provider<Repository> repoProvider,
      Provider<Database> dbProvider,
      Provider<AuthService> authProvider) {
    return new Controller_Factory(repoProvider, dbProvider, authProvider);
  }

  public static Controller newController(Repository repo, Database db, AuthService auth) {
    return new Controller(repo, db, auth);
  }
}
