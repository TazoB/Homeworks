package exercise3;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

public class GreetingCardController {
    @FXML
    public CheckBox balloons;
    @FXML
    public CheckBox hearts;
    @FXML
    public CheckBox stars;

    public void changeScene() {
        new ResultController().generateGreetingCard(balloons, hearts, stars);
    }
}