package exercise2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

public class PhotosController {
    List<Image> images = new ArrayList<>(
            List.of(
                    new Image("exercise2/Images/1.jpg"),
                    new Image("exercise2/Images/2.jpg"),
                    new Image("exercise2/Images/3.jpg"),
                    new Image("exercise2/Images/4.jpg"),
                    new Image("exercise2/Images/5.jpg"),
                    new Image("exercise2/Images/6.jpg"),
                    new Image("exercise2/Images/7.jpg"),
                    new Image("exercise2/Images/8.jpg"),
                    new Image("exercise2/Images/9.jpg"),
                    new Image("exercise2/Images/10.jpg")
            )
    );

    @FXML
    public Label label;
    public int index = 0;
    public ImageView imageView;

    public void nextImage() {
        if(index != 9) {
            imageView.setImage(images.get(++index));
            label.setText(index+1 + "");
        }
    }

    public void previousImage() {
        if(index != 0) {
            imageView.setImage(images.get(--index));
            label.setText(index+1 + "");
        }
    }
}
