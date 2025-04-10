package davaleba1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("OneButton.fxml"));

        stage.setOnCloseRequest(event -> {
            event.consume();
            logOut(stage);
        });

        stage.setScene(new Scene(root));
        stage.show();
    }

    public void logOut(Stage stage) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Alert");
        alert.setHeaderText("You are exciting from program");
        alert.setContentText("Do you want to leave?");
        alert.showAndWait();
        if(alert.getResult() == ButtonType.OK) {
            stage.close();
        }
    }
}