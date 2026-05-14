package lab6;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AuthService_Factory implements Factory<AuthService> {
  private static final AuthService_Factory INSTANCE = new AuthService_Factory();

  @Override
  public AuthService get() {
    return provideInstance();
  }

  public static AuthService provideInstance() {
    return new AuthService();
  }

  public static AuthService_Factory create() {
    return INSTANCE;
  }

  public static AuthService newAuthService() {
    return new AuthService();
  }
}
