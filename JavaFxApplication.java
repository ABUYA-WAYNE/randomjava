
import javafx.application.Application;
import javafx.stage.Stage;

public class JavaFxApplication extends Application {

    public void start(Stage window) {
        window.setTitle("Hello world!");
        window.show();
    }

    public static void main(String[] args) {
        launch(JavaFxApplication.class);
    }
}
