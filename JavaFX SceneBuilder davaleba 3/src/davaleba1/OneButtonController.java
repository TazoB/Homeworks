package davaleba1;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class OneButtonController {
    private int counter = 4;

    public void clickMeButton(ActionEvent actionEvent) {
        if(counter == 0) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Alert");
            alert.setHeaderText("You clicked the button 5 times");
            alert.setContentText("You have reached the maximum number of clicks");
            alert.showAndWait();
            counter = 5;
            if(alert.getResult() == ButtonType.OK) {
                Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                stage.close();
            }

        }
        counter--;
    }
}
