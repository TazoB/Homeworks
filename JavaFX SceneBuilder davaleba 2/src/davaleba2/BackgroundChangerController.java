package davaleba2;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import java.util.Random;

public class BackgroundChangerController {
    @FXML
    private AnchorPane AnchorPane;

    public void changeBackground() {
        Random random = new Random();
        AnchorPane.setStyle("-fx-background-color: rgb(" + random.nextInt(256) + "," + random.nextInt(256) + "," + random.nextInt(256) + ")");
    }
}
