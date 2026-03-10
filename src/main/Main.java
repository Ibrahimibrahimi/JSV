package main;

import javafx.stage.Stage;
import javafc.scene.Scene;

public class Main extends Application {

    @override
    public void start(Stage stage) {

        BorderPane root = new BorderPane();

        Scene scene = new Scene(root, 945, 700);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]) {

    }
}
