import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class davaleba1 extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();
        Text text = new Text("გამარჯობა ეს არის აპლიკაცია!");

        text.setFill(Color.rgb(93, 22, 97));
        text.setX(700);
        text.setY(325);
        group.getChildren().add(text);

        Image icon = new Image("java.png");
        stage.getIcons().add(icon);

        Scene scene = new Scene(group);
        scene.setFill(Color.rgb(31, 182, 219));

        stage.setScene(scene);
        stage.setWidth(1500);
        stage.setHeight(700);
        stage.setResizable(false);
        stage.show();
    }
}