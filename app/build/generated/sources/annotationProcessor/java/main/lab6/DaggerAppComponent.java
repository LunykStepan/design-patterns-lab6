package lab6;

import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private AppModule appModule;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  private Repository getRepository() {
    return new Repository(
        AppModule_ProvideDatabaseFactory.proxyProvideDatabase(appModule), new AuthService());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.appModule = builder.appModule;
  }

  @Override
  public Controller getController() {
    return new Controller(
        getRepository(),
        AppModule_ProvideDatabaseFactory.proxyProvideDatabase(appModule),
        new AuthService());
  }

  public static final class Builder {
    private AppModule appModule;

    private Builder() {}

    public AppComponent build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      return new DaggerAppComponent(this);
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }
  }
}
