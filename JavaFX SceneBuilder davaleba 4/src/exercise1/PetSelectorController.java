package exercise1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class PetSelectorController {
    @FXML
    public RadioButton cat;
    @FXML
    public RadioButton dog;
    @FXML
    public RadioButton rabbit;
    @FXML
    public RadioButton bird;
    @FXML
    public TextField petName;
    @FXML
    public Label label;

    public void submit() {
        String pet = "";
        String name = petName.getText();

        if(cat.isSelected()) pet = "cat";
        else if(dog.isSelected()) pet = "dog";
        else if(rabbit.isSelected()) pet = "rabbit";
        else if(bird.isSelected()) pet = "bird";

        if(pet.isEmpty() || name.isEmpty()) {
            label.setText("You have to Fill Your Pet's Details!");
            label.setTextFill(Color.RED);
            label.setFont(Font.font(28.0));
        } else {
            label.setText("You chose a " + pet + " named " + name);
            label.setTextFill(Color.BLACK);
        }
    }
}
