import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class davaleba2 extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();

        Rectangle square = new Rectangle(100, 100);
        square.setX(100);
        square.setY(100);
        square.setFill(Color.rgb(41, 196, 83));

        Line diagonal1 = new Line(100,100,200,200);
        diagonal1.setFill(Color.YELLOW);
        Line diagonal2 = new Line(200,100,100,200);
        diagonal2.setFill(Color.YELLOW);

        Line rectangleLine1 = new Line(300, 100, 600, 100);
        rectangleLine1.setFill(Color.BLUE);
        Line rectangleLine2 = new Line(300, 100, 300, 300);
        rectangleLine1.setFill(Color.BLUE);
        Line rectangleLine3 = new Line(300, 300, 600, 300);
        rectangleLine1.setFill(Color.BLUE);
        Line rectangleLine4 = new Line(600, 100, 600, 300);
        rectangleLine1.setFill(Color.BLUE);

        group.getChildren().addAll(square, diagonal1, diagonal2, rectangleLine1, rectangleLine2, rectangleLine3, rectangleLine4);

        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setWidth(1500);
        stage.setHeight(700);
        stage.show();
    }
}
