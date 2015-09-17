package lab_2_1;/**
 * Created by Student Lab on 10/9/2558.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class fxml extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("fxml_example.fxml"));
        Scene scene = new Scene(root, 300, 275);
        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
    }
}
