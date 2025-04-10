package davaleba2;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class defaultScreenController {
    public void changeToYellowScreen(ActionEvent actionEvent) throws Exception {
        changeScreen(actionEvent, "yellowScreen.fxml");
    }

    public void changeToGreenScreen(ActionEvent actionEvent) throws Exception{
        changeScreen(actionEvent, "greenScreen.fxml");
    }

    public void changeToRedScreen(ActionEvent actionEvent) throws Exception{
        changeScreen(actionEvent, "redScreen.fxml");
    }

    public void changeScreen(ActionEvent actionEvent, String name) throws Exception{
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource(name)
        );
        Parent root = loader.load();

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
}
