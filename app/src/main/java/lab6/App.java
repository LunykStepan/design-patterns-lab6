package lab6;

public class App {
    public static void main(String[] args) {
        // Створюємо DI контейнер
        AppComponent component = DaggerAppComponent.create();

        // Отримуємо контролер і запускаємо його
        Controller controller = component.getController();
        controller.start();
    }
}