import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class davaleba3 extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();
        Circle face = new Circle(750, 300, 100, Color.rgb(255, 234, 0));
        face.setStroke(Color.BLACK);
        face.setStrokeWidth(5);

        Circle firstEye = new Circle(715, 275, 10);
        Circle secondEye = new Circle(785, 275, 10);
        Line mouth = new Line(715, 338, 785, 338);
        mouth.setStrokeWidth(10);
        Circle mouthCircle1 = new Circle(710, 338, 5);
        Circle mouthCircle2 = new Circle(790, 338, 5);


        group.getChildren().addAll(face, firstEye, secondEye, mouth, mouthCircle1, mouthCircle2);
        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setWidth(1500);
        stage.setHeight(700);
        stage.show();
    }
}
