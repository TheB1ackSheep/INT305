package lab_2_2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by Student Lab on 10/9/2558.
 */
public class main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("FXML TableViewExample");
        Pane myPane = (Pane) FXMLLoader.load(getClass().getResource
                ("address_book.fxml"));
        Scene myScene = new Scene(myPane);
        primaryStage.setScene(myScene);
        primaryStage.show();
    }
}
