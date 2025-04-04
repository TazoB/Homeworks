package davaleba3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.util.Random;

public class AnnoyingButtonController {
    @FXML
    private Button annoyingButton;

    public void changePlace() {
        Random random = new Random();
        annoyingButton.setLayoutX(random.nextInt(500));
        annoyingButton.setLayoutY(random.nextInt(300));
    }
}
