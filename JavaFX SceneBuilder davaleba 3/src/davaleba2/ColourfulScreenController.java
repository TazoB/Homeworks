package davaleba2;

import javafx.event.ActionEvent;

public class ColourfulScreenController {
    public void goBack(ActionEvent actionEvent) throws Exception {
        new defaultScreenController().changeScreen(actionEvent, "defaultScreen.fxml");
    }
}
