package lab6;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Repository_Factory implements Factory<Repository> {
  private final Provider<Database> dbProvider;

  private final Provider<AuthService> authProvider;

  public Repository_Factory(Provider<Database> dbProvider, Provider<AuthService> authProvider) {
    this.dbProvider = dbProvider;
    this.authProvider = authProvider;
  }

  @Override
  public Repository get() {
    return provideInstance(dbProvider, authProvider);
  }

  public static Repository provideInstance(
      Provider<Database> dbProvider, Provider<AuthService> authProvider) {
    return new Repository(dbProvider.get(), authProvider.get());
  }

  public static Repository_Factory create(
      Provider<Database> dbProvider, Provider<AuthService> authProvider) {
    return new Repository_Factory(dbProvider, authProvider);
  }

  public static Repository newRepository(Database db, AuthService auth) {
    return new Repository(db, auth);
  }
}
