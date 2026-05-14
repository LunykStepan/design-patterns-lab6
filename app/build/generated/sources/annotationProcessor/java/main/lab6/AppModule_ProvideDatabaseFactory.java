package lab6;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideDatabaseFactory implements Factory<Database> {
  private final AppModule module;

  public AppModule_ProvideDatabaseFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Database get() {
    return provideInstance(module);
  }

  public static Database provideInstance(AppModule module) {
    return proxyProvideDatabase(module);
  }

  public static AppModule_ProvideDatabaseFactory create(AppModule module) {
    return new AppModule_ProvideDatabaseFactory(module);
  }

  public static Database proxyProvideDatabase(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.provideDatabase(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
