package lab6;
import dagger.Module;
import dagger.Provides;

@Module 
public class AppModule {
    @Provides // Метод, який вчить Dagger створювати Database
    public Database provideDatabase() {
        return new Database();
    }
}