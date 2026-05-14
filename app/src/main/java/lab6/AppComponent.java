package lab6;
import dagger.Component;

@Component(modules = AppModule.class) // Об'єднує все в один граф
public interface AppComponent {
    Controller getController(); // Точка входу
}